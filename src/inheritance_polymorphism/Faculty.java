package inheritance_polymorphism;

public class Faculty extends Employee {

    public static void main(String[] args) {

        Faculty profSmith = new Faculty(
                "Dr. Alice Smith",
                "123 University Ave",
                "555-0199",
                "asmith@university.edu",
                "Science Hall 402",
                85000.00,
                "Mon/Wed 2:00 PM - 4:00 PM",
                Faculty.PROFESSOR
        );

        System.out.println(profSmith);
    }

    public static final String LECTURER = "Lecturer";
    public static final String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static final String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static final String PROFESSOR = "Professor";

    private String officeHours, rank;

    public Faculty(String name, String address, String phoneNumber,
                    String emailAddress, String office, double salary, String officeHours, String rank
    )  {
       super(name, address, phoneNumber, emailAddress, office, salary);
       this.officeHours = officeHours;
       this.rank = rank;
    }


    @Override
    public String toString() { return "Class: Faculty, Name: " + name; }
}
