package inheritance_polymorphism;

public class Person extends Object {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }

    @Override
    public String toString() {
        return "Person";
    }
}
