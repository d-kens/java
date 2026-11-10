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


**Wildcard Generic Types**

Generic types are **invariant**: if `Sub` is a subtype of `Super`, `Box<Sub>` is still **not** a subtype of `Box<Super>`. For example, `Integer` is a subtype of `Number`, but `List<Integer>` is not a subtype of `List<Number>`. So a method that takes `List<Number>` will not accept a `List<Integer>`.

```java
static double sum(List<Number> list) { ... }

List<Integer> ints = List.of(1, 2, 3);
sum(ints);                                     // compile error: List<Integer> is not a List<Number>
```

Java does this for type safety. If `List<Integer>` could be used as a `List<Number>`, you could add a `Double` to it through the `List<Number>` reference, and the list of Integers would then hold a Double.

A wildcard (`?`) relaxes invariance by letting a variable or parameter accept a **range** of generic types instead of exactly one. There are three forms:

| Form | Name | Accepts | Read elements as | Can add |
|---|---|---|---|---|
| `?` | Unbounded wildcard | Any type (same as `? extends Object`) | `Object` | Nothing (except `null`) |
| `? extends T` | Upper-bounded wildcard | `T` or any **subtype** of `T` | `T` | Nothing (except `null`) |
| `? super T` | Lower-bounded wildcard | `T` or any **supertype** of `T` | `Object` | `T` (and its subtypes) |

These rules apply to **any** generic type. "Read" means any method that returns the element type (`get()`, `pop()`, `peek()`). "Add" means any method that takes the element type as input (`add(E)`, `push(E)`, `set(int, E)`). For each call, the compiler asks: "is this guaranteed to be safe, whatever the real type turns out to be?"

**1. Unbounded wildcard: `<?>`**
- `?` means "some specific type, but unknown". `List<?>` accepts `List<Integer>`, `List<String>`, or a list of any other type.
- **Read:** every element is at least an `Object`, so reading as `Object` is always safe.
- **Add:** not allowed (except `null`). The compiler doesn't know the real type, so no value is guaranteed to fit.
- Use it when the code doesn't depend on the element type: it only uses `Object` methods (`toString()`, `equals()`) or type-independent operations (`size()`, `isEmpty()`, `clear()`).

```java
static void printAll(List<?> list) {
    for (Object item : list) {                 // elements come out as Object
        System.out.print(item + " ");
    }
    // list.add("x");                          // compile error: the real type is unknown
}

printAll(List.of(1, 2, 3));                    // OK
printAll(List.of("a", "b"));                   // OK
```

**2. Upper-bounded wildcard: `<? extends T>`**
- `List<? extends Number>` accepts `List<Number>`, `List<Integer>`, `List<Double>`, and so on.
- **Read:** every element is at least a `T`, so you can read elements as `T` and call `T`'s methods.
- **Add:** not allowed (except `null`). The real list might be a `List<Double>`, so adding an `Integer` would be unsafe, and the compiler can't tell which subtype it is.
- Use it when the structure is a **producer**: you only read `T` values from it.

```java
static double sum(List<? extends Number> list) {
    double total = 0;
    for (Number n : list) {                    // each element is at least a Number
        total += n.doubleValue();
    }
    // list.add(5);                            // compile error: it might be a List<Double>
    return total;
}

sum(List.of(1, 2, 3));                         // OK: Integer extends Number
sum(List.of(1.5, 2.5));                        // OK: Double extends Number
```

**3. Lower-bounded wildcard: `<? super T>`**
- `List<? super Integer>` accepts `List<Integer>`, `List<Number>`, and `List<Object>`.
- **Add:** you can add `T` (and its subtypes). Whatever the real type is, it is `T` or a supertype of `T`, so a `T` always fits.
- **Read:** elements come out only as `Object`, because the list could be a `List<Object>` holding anything.
- Use it when the structure is a **consumer**: you only write `T` values into it.

```java
static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 3; i++) {
        list.add(i);                           // an Integer fits in a list of Integer, Number or Object
    }
    Object first = list.get(0);                // reading gives only Object
}

addNumbers(new ArrayList<Integer>());          // OK
addNumbers(new ArrayList<Number>());           // OK
addNumbers(new ArrayList<Object>());           // OK
// addNumbers(new ArrayList<Double>());        // compile error: Double is not a supertype of Integer
```

**Choosing one: PECS (Producer `extends`, Consumer `super`)**
- If the parameter **produces** values you read, use `? extends T`.
- If the parameter **consumes** values you write into it, use `? super T`.
- If the code doesn't depend on the element type at all, use `?`.
- If you both read `T` and write `T`, use no wildcard, just `T`.

A method often uses both. The JDK's `Collections.copy` reads from `src` (producer) and writes into `dest` (consumer):

```java
public static <T> void copy(List<? super T> dest, List<? extends T> src)
```

This lets you copy a `List<Integer>` into a `List<Number>` or a `List<Object>`.

See `AnyWildCardDemo.java` (`?`) and `SuperWildCardDemo.java` (`? super T`) for the same ideas applied to `GenericStack`.
