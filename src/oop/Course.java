package oop;

public class Course {
    private String courseName;
    private String[] students = new String[100]; // Improve by using a dynamic array
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudents(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        // TODO
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
