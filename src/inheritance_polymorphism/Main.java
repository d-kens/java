package inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(21);
        System.out.println(circle.toString());
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getDiameter());
        System.out.println(circle.toString());
    }
}
