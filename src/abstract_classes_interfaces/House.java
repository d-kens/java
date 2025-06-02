package abstract_classes_interfaces;

import java.util.Date;

public class House implements Comparable<House>{
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
    public Object clone() throws CloneNotSupportedException {
        House houseClone = (House)super.clone();
        houseClone.whenBuilt = (Date)(whenBuilt.clone()); // Deep copy on whenBuilt
        return houseClone;
    }

    @Override
    public int compareTo(House object) {
        if (area > object.area)
            return 1;
        else if (area < object.area)
            return -1;
        else
            return 0;
    }
}
