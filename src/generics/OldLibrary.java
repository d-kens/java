package generics;

import java.util.ArrayList;
import java.util.List;

public class OldLibrary {

    /**
     * Generics were added in Java 5. Before that List had no type parameter, and a lot of code was already written that way.
     * When List became List<E> Java still allowed plain List, so that old code would keep compiling. The plain List is a raw type.
     */

    static void printAll(List items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    static  List getNames() {
        List names = new ArrayList();
        names.add("Dickens");
        return names;
    }



    // New code that uses Generics can still call it without anyone rewriting OldLibray
    static void main(String[] args) {

        // Passing a generic list to old code; allowed no warning
        List<String> cities = new ArrayList<>();
        cities.add("Nairobi");
        cities.add("Mombasa");
        OldLibrary.printAll(cities);

        // Storing a list from old code in a generic variable; compiles.
        List<String> names  = OldLibrary.getNames();


        rawComparableMax("Welcome", 23); // Compiles but throws ClassCastException at runtime
        // genericComparableMax("Welcome", 23); // Compile error. String and Integer are not the same T

    }

    static Comparable rawComparableMax(Comparable a, Comparable b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    static <T extends Comparable<T>> T genericComparableMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
