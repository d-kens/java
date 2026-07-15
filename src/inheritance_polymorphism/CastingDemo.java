package inheritance_polymorphism;

public class CastingDemo {
    public static void main(String[] args) {
        displayObject(new Circle(42));
        displayObject(new Rectangle(100, 50));
    }


    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle) object).getArea());
            System.out.println("The circle diameter is " + (((Circle) object).getDiameter()));
        } else if(object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea());
        }
    }

}
