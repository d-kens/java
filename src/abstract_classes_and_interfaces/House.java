package abstract_classes_and_interfaces;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() {
        try {
            House clone = (House) super.clone(); // perform a shallow copy
            clone.whenBuilt = (Date)(whenBuilt.clone()); // Deep copy on when built

            return clone;
        } catch (CloneNotSupportedException exception) {
            return null;
        }
    }

    @Override
    public int compareTo(House o) {
        if (area > o.getArea())
            return 1;
        else if (area < o.getArea())
            return -1;
        else return 0;
    }

}
