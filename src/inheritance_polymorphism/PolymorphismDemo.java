package inheritance_polymorphism;

import abstract_classes_and_interfaces.GeometricClass;

/**
 * Polymorphism - A variable of supertype can refer to a subtype object
 */

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(42)); // polymorphic call
        displayObject(new Rectangle(100, 50)); // polymorphic call
    }

    public static void displayObject(GeometricClass object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
