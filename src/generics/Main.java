/**
 Generics lets you parameterize types. With this capability you can define a class or a method with generic types that the compiler can replace with concrete type.
 The Key Benefit of Generics [Motivation for Using Generics]
 - Generics enable errors to be detected at compile time rather than at runtime. This improves software reliability.
 - Generic class or method permits you to specify allowable types of objects that the class or a method can work with. If you attempt to use an incompatible object, the compiler will detect that error.
 */

package generics;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    static void main() {
        // Prior to JDK 1.5
        // This code compiles fine but has a runtime error because a string cannot be compared with a date
        Comparable c = new Date();
//        System.out.println(c.compareTo("red"));

        // JDK 1.5
        // The new generic type detects possible error at compile time
        Comparable<Date> c1 = new Date();
//        System.out.println(c1.compareTo("red"));


        // ArrayList has been a genric class since JDK 1.5
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("White");
//        list.add(Integer.valueOf(1)) // Compile time error occurs if you attempt to add a non-string

        // Generic types must be reference types, you cannot replace generic type with a primitive type such as int, double or char
        // ArrayList<int> intList = new ArrayList<>(); // This is wrong

        // To create an array of int, you have to use
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(40); // Java automatically wraps 40 into an integer object (Autoboxing)
        intList.add(Integer.valueOf(200));


        // Casting is not needed to retrieve a value from a list with a specified element type
        // because the compiler already knows the element type
        // prior to JDK 1.5 without using generics, you would have to cast the return value
        ArrayList<String> colorStrings = new ArrayList<>();
        colorStrings.add("Blue");
        colorStrings.add("White");
        colorStrings.add("Yellow");

        String s = colorStrings.get(0); // No casting is needed

        // String s = (String)(list.get(0)); // Casting needed prior to JDK 1.5


        // If the elements are of wrapper types, such as Integer, Double, Character,
        // You can directly assign an element to a primitive type variable

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(5.5); // 5.5 is automatically converted to a Double object
        doubleArrayList.add(1.7); // 1.7 is automatically converted to a Double object
        Double doubleObject = doubleArrayList.get(0); // No casting is needed
        double d = doubleArrayList.get(1); // Automatically converted to double (auto-unboxing)


    }

}

