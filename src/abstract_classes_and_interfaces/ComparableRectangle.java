package abstract_classes_and_interfaces;

import inheritance_polymorphism.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double hieght) {
        super(width, hieght);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ComparableRectangle rectangle) {
            return getArea() == rectangle.getArea();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(getArea());
    }
}
