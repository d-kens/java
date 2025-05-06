package exception_handling;

public class Circle {

    private double radius;

    private static int numberOfObjects = 0;

    public Circle() throws InvalidRadiusException {
        this(1.0);
    }

    public Circle(double radius) throws InvalidRadiusException  {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new InvalidRadiusException(radius);

    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }



    public static void main(String[] args) {

//        try {
//            Circle circle1 = new Circle(5);
//            Circle circle2 = new Circle(-5);
//            Circle circle3 = new Circle(0);
//        } catch (InvalidRadiusException ex) {
//            System.out.println(ex);
//        }
//
//        System.out.println("Number of objects created: " + Circle.getNumberOfObjects());

        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main.");
        }
    }

    public static void method() throws Exception {
        try {
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }

    }
}
