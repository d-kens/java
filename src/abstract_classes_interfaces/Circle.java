package abstract_classes_interfaces;

public class Circle extends GeometricObject {
    private double radius;


    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public boolean equals(Object object) {
        if (object instanceof Circle)
            return this.radius == ((Circle) object).radius;
        else
            return false;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }
}
