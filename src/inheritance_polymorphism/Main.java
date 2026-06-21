package inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(21);
        System.out.println(circle1.toString());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getDiameter());
        System.out.println(circle1.toString());
    }
}
