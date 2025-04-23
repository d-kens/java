package inheritance_polymorphism;


// Dynamic binding - A process where the JVM decides which method to call at runtime based on the actual type of an object not the reference (declared type)

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent()); // polymorphic call
        m(new Student1());
        m(new Person1());
        m(new Object());
    }

    public static void m(Object object) {
        System.out.println(object.toString()); // Dynamic binding
    }
}

class GraduateStudent extends Student1 {

}

class Student1 extends Person1 {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person1 extends Object {
    @Override
    public String toString() {
        return "Person1";
    }
}



