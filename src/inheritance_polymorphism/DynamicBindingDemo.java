package inheritance_polymorphism;

/**
 * Dynamic Binding - A method can be implemented in several classes along the inheritance chain. The JVM
 * decides which method is invoked at runtime based on the actual type of the object.
 */

public class DynamicBindingDemo {
    public static void main(String[] args) {

        // Polymorphic calls
        m(new GraduateStudent());
        m(new Student());
        m(new Person1());
        m(new Object());
    }

    // Dynamic Binding
    public static void m(Object object) {
        System.out.println(object.toString());
    }
}

class GraduateStudent extends Student {}

class Student extends Person1 {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person1 extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}


