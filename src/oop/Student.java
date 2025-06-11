package oop;

public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;



    public static void main(String[] args) {
        Student student = new Student();


        // Display default value for instance variables
        System.out.println("Default values for student object");
        System.out.println("name: " + student.name);
        System.out.println("age: " + student.age);
        System.out.println("isScienceMajor: " + student.isScienceMajor);
        System.out.println("gender: " + student.gender);

        // Demonstrate uninitialized local variables (will cause compile error if uncommented)
//        int x;
//        String y;
//
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);



    }
}
