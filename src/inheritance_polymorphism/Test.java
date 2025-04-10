package inheritance_polymorphism;

public class Test {
    public static  void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(14);
        circle1.setFilled(true);
        circle1.setColor("blue");

        System.out.println("A circle " + circle1.toString());
        System.out.println("The color is " + circle1.getColor());
        System.out.println("The radius is " + circle1.getRadius());
        System.out.println("The area is " + circle1.getArea());
        System.out.println("The diameter is " + circle1.getDiameter());


        Circle circle2 = new Circle(28);
        System.out.println("A circle " + circle2.toString());
        System.out.println("The color is " + circle2.getColor());
        System.out.println("The radius is " + circle2.getRadius());
        System.out.println("The area is " + circle2.getArea());
        System.out.println("The diameter is " + circle2.getDiameter());


        Circle circle3 = new Circle(42, "orange", true);
        circle3.setColor("yellow");
        System.out.println("A circle " + circle3.toString());
        System.out.println("The color is " + circle3.getColor());
        System.out.println("The radius is " + circle3.getRadius());
        System.out.println("The area is " + circle3.getArea());
        System.out.println("The diameter is " + circle3.getDiameter());
    }
}
