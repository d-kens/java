package inheritance_polymorphism;

/**
 * Constructor chaining is the process in which constructing an object automatically invokes the constructors of all its superclasses
 * starting from the top of the inheritance hierarchy down to the actual class being instantiated.
 */

public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
}
