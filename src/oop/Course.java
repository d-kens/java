package oop;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }



    public static void main(String[] args) {
        Course dataStructures = new Course("Data Structures and Algorithms");

        dataStructures.addStudent("Dickens");
        dataStructures.addStudent("Charlie");
        dataStructures.addStudent("Philip");

        System.out.println("The number os students in " + dataStructures.getCourseName() + " is " + dataStructures.getNumberOfStudents());
        String[] dsaStudents = dataStructures.getStudents();

        for (int i = 0; i < dataStructures.getNumberOfStudents(); i++) {
            System.out.println(dsaStudents[i]);
        }

    }
}
