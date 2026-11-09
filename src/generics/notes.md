## Generics
- Generics let you **parameterize types**: you pass a data type as an argument, the same way you pass values to a method.
- With generics you can define classes, interfaces and methods that work with any data type.
- **Key benefit:** errors are caught at **compile time** instead of at runtime. A generic class or method lets you specify
  which types it is allowed to work with. If you try to use an incompatible object, the compiler reports an error.
  - Generic types must be reference types. You cannot replace a generic type with a primitive type such as int, double or char. For example, the below statement is wrong:

    ```java
        ArrayList<int> intList = new ArrayList<>();
    ```

**Example (compile-time type checking):**

    ```java
    List rawList = new ArrayList();
    rawList.add("hello");
    Integer n = (Integer) rawList.get(0);   // compiles, but throws ClassCastException at runtime
    
    List<String> names = new ArrayList<>();
    names.add("hello");
    names.add(42);                          // compile error: int cannot be converted to String
    String s = names.get(0);                // no cast needed
    ```

- **Bounded Generic Type:** A generic type specified as a subtype of another type.

**Raw Types and Backward Compatibility:** 
- A generic class or interface used without specifying a concrete type, called raw type, enables backward compatibility with earlier versions of java.
- Raw type: A generic class used without a type parameter. Using raw types allows backward compatibility earlier versions of Java.
- Raw types are unsafe

**Example (raw type vs parameterized type):**

```java
ArrayList<String> names = new ArrayList<>();   // parameterized type: only holds Strings
ArrayList dates = new ArrayList();             // raw type: no type parameter given

dates.add(new Date());                         // compiles with an unchecked warning
dates.add("not a date");                       // also compiles, nothing restricts the element type

// Date date = dates.get(0);                   // compile error: get() returns Object on a raw type
Date date = (Date) dates.get(0);               // a cast is needed, as it was before generics
```

**Example (backward compatibility):**

Generics were added in Java 5. Before that, `List` had no type parameter, and a lot of code was already written that way. When `List` became `List<E>`, Java still allowed plain `List` so that the old code would keep compiling. That plain `List` is a raw type.

Imagine this class was written before Java 5, so it can only use plain `List`:

```java
class OldLibrary {
    static void printAll(List items) {         // takes a raw List
        for (Object item : items) {
            System.out.println(item);
        }
    }

    static List getNames() {                   // returns a raw List
        List names = new ArrayList();
        names.add("Dickens");
        return names;
    }
}
```

New code that uses generics can still call it, without anyone rewriting `OldLibrary`:

```java
// 1. Passing a generic list to old code: allowed, no warning
List<String> cities = new ArrayList<>();
cities.add("Nairobi");
OldLibrary.printAll(cities);

// 2. Storing a list from old code in a generic variable: compiles, with an unchecked warning
List<String> names = OldLibrary.getNames();
```

The warning in case 2 is there because the compiler cannot confirm that the list from `getNames()` really contains only Strings. You are taking responsibility for that.

**Example (why raw types are unsafe):**

1. The compiler cannot stop incompatible arguments, so the error shows up at runtime.

```java
static Comparable max(Comparable a, Comparable b) {   // raw Comparable
    return a.compareTo(b) > 0 ? a : b;
}

max("Welcome", 23);                            // compiles, but throws ClassCastException at runtime
```

The generic version moves that error to compile time:

```java
static <T extends Comparable<T>> T max(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
}

max("Welcome", 23);                            // compile error: String and Integer are not the same T
```

2. A raw reference can bypass the type checks of a generic object (**heap pollution**). The failure happens later, away from the line that caused it.

```java
List<String> strings = new ArrayList<>();
List alias = strings;                          // raw reference to the same list

alias.add(42);                                 // the Integer 42 goes into the list that strings also points to
String s = strings.get(0);                     // throws ClassCastException: element 0 is an Integer, not a String
```

Step by step:
- `strings` and `alias` are two variables pointing to the **same list**.
- `alias` is raw, so the compiler allows `alias.add(42)` with only a warning. Nothing checks the type at runtime either, because generic type information is removed after compilation (**type erasure**). The list now holds an `Integer`.
- The compiler trusts that a `List<String>` only holds Strings, so it quietly turns `strings.get(0)` into `(String) strings.get(0)`.
- That hidden cast runs on an `Integer`, which cannot be cast to `String`, so the exception is thrown.

The bug is on the `alias.add(42)` line, but the program crashes on the `strings.get(0)` line, which has no mistake in it.

**Note:** A raw `List` is not the same as `List<Object>`. A `List<String>` can be assigned to a raw `List`, but not to a `List<Object>` (compile error). Use `javac -Xlint:unchecked` to see each unchecked warning. Avoid raw types in new code.
