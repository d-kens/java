package inheritance_polymorphism;

public class Staff extends Employee {

    public static void main(String[] args) {
        Staff staffMember = new Staff(
                "John Doe",
                "456 College Lane",
                "555-0234",
                "jdoe@university.edu",
                "Admin Building 101",
                45000.00,
                "IT Support Specialist"
        );

        System.out.println(staffMember);
    }

    private String title;

    public Staff(String name, String address, String phoneNumber,
                   String emailAddress, String office, double salary, String title
    )  {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    @Override
    public String toString() { return "Class: Staff, Name: " + name; }
}
