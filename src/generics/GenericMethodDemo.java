package generics;

import abstract_classes_and_interfaces.GeometricClass;
import inheritance_polymorphism.Circle;
import inheritance_polymorphism.GeometricObject;
import inheritance_polymorphism.Rectangle;

public class GenericMethodDemo {
    static void main(String[] args) {

        Integer[] integers = {100, 130, 150, 170, 200};
        String[] strings = {"London", "Paris", "New York", "Mombasa", "Nairobi", "Kisumu"};

        print(integers);
        print(strings);

        GenericMethodDemo.<String>print(strings);
        GenericMethodDemo.<Integer>print(integers);

        Rectangle rectangle = new Rectangle(100, 50);
        Circle circle = new Circle(100);

        System.out.println("Same area? " + equalArea(rectangle, circle));

    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }

    // A generic type can be specified as a subtype of another type. Such a generic type is called bounded.
    public static <E extends GeometricClass> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }

}
