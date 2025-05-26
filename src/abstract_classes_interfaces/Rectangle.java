package abstract_classes_interfaces;

public class Rectangle extends GeometricObject {
    private double height;
    private double width;


    public Rectangle() {}

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return  width * height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}
