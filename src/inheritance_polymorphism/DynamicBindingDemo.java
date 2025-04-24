package inheritance_polymorphism;


// Dynamic binding - A process where the JVM decides which method to call at runtime based on the actual type of an object not the reference (declared type)
// Polymorphism - A concept in OOP that allows a supertype variable to refer to a subtype object
// Many forms: one variable (supertype variable) can take many form (can point to any object of the of subtypes)

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent()); // polymorphic call
        m(new Student1());
        m(new Person1());
        m(new Object());

        Object object = new Object();
        Object object1 = new Circle(21);

        if (object1 instanceof Circle)
            System.out.println("Yes");
        else
            System.out.println("No");


        GeometricObject geometricObject;
        geometricObject = new Circle(20);
        geometricObject = new Rectangle(20, 60);

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



