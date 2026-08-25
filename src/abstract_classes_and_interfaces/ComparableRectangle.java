package abstract_classes_and_interfaces;

import inheritance_polymorphism.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return Double.compare(getArea(), o.getArea());
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
