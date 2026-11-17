/**
 Generics lets you parameterize types. With this capability you can define a class or a method with generic types that the compiler can replace with concrete type.
 The Key Benefit of Generics [Motivation for Using Generics]
 - Generics enable errors to be detected at compile time rather than at runtime. This improves software reliability.
 - Generic class or method permits you to specify allowable types of objects that the class or a method can work with. If you attempt to use an incompatible object, the compiler will detect that error.
 */


package generics;

import java.util.Date;

public class Main {

    static void main() {
        // Prior to JDK 1.5
        // This code compiles fine but has a runtime error because a string cannot be compared with a date
        Comparable c = new Date();
        System.out.println(c.compareTo("red"));

        // JDK 1.5
        // The new generic type detects possible error at compile time
        Comparable<Date> c1 = new Date();
        System.out.println(c1.compareTo("red"));
    }

}

