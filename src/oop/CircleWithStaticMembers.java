package oop;

public class CircleWithStaticMembers {
    double radius;
    static int numberOfCircleObjects = 0;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfCircleObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfCircleObjects++;
    }

    public static int getNumberOfCircleObjects() {
        return numberOfCircleObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {

        CircleWithStaticMembers circle1 = new CircleWithStaticMembers();
        System.out.println(CircleWithStaticMembers.getNumberOfCircleObjects());

        CircleWithStaticMembers circle2 = new CircleWithStaticMembers(21);
        System.out.println(CircleWithStaticMembers.numberOfCircleObjects);

    }
}
