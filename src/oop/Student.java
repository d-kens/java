package oop;

import java.util.Date;

/**
 * Immutable class
 *  - All data fields must be private
 *  - Not mutator methods for the data fields
 *  - Not accessor method can return a reference to a data field that is mutable
 */

public class Student {
    private int id;
    private String name;
    private final java.util.Date dateCreated;

    public Student(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new Date();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    public static void main(String[] args) {
        Student student = new Student(10010, "Onyango Dickens");
        Date dateCreated = student.getDateCreated();
        dateCreated.setTime(2000000); // this class is mutable
    }
}
