package exception_handling;

public class Circle {


    private double radius;

    private static int numberOfObjects = 0;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");

    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }



    public static void main(String[] args) {

        try {
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(-5);
            Circle circle3 = new Circle(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }


        System.out.println("Number of objects created: " + Circle.getNumberOfObjects());
    }
}
