package abstract_classes_and_interfaces;

import java.util.Date;

public abstract class GeometricClass {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** construct a default geometric object **/
    protected GeometricClass() {
        dateCreated = new Date();
    }

    /** construct a geometric object with color and filled value **/
    protected GeometricClass(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled();
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + "and filled " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
