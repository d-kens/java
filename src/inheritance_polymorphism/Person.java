package inheritance_polymorphism;

public class Person {
    protected String name, address, phoneNumber, emailAddress;

    public Person() {}

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: name = " + name;
    }
}
