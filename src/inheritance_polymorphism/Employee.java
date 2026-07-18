package inheritance_polymorphism;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {}

    public Employee(String name, String address, String phoneNumber,
                    String emailAddress, String office, double salary
    )  {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }


    @Override
    public String toString() { return "Class: Employee, Name: " + name; }
}
