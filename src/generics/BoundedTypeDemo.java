import abstract_classes_and_interfaces.GeometricClass;
import inheritance_polymorphism.Circle;
import inheritance_polymorphism.Rectangle;

void main() {
    Circle circle = new Circle(42);
    Rectangle rectangle = new Rectangle(100, 40);

    System.out.println(equalArea(circle, rectangle));
}

public static <E extends GeometricClass> boolean equalArea(E object1, E object2) {
    return  object1.getArea() == object2.getArea();
}