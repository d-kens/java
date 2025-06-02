package abstract_classes_interfaces;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public int compareTo(ComparableRectangle object) {
        if(getArea() > object.getArea())
            return 1;
        else if (getArea() < object.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
