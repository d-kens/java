## Generics
- Generics let you **parameterize types**: you pass a data type as an argument, the same way you pass values to a method.
- With generics you can define classes, interfaces and methods that work with any data type.
- **Key benefit:** errors are caught at **compile time** instead of at runtime. A generic class or method lets you specify
  which types it is allowed to work with. If you try to use an incompatible object, the compiler reports an error.
- Generic types must be reference types. You cannot replace a generic type with a primitive type such int, double or char. Foe example the below statement is wrong:
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
