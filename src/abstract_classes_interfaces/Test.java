package abstract_classes_interfaces;

public class Test {

    public static void main(String[] args) {
        GeometricObject circleObject = new Circle(5);
        GeometricObject rectangleObject = new Rectangle(60, 120);

        System.out.println("The two objects have the same area? " + equalArea(circleObject, rectangleObject));

        displayGeometricObject(circleObject);
        displayGeometricObject(rectangleObject);
    }


    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }



}
