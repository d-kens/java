package inheritance_polymorphism;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Nairobi");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println(cityList);

        System.out.println("List size " + cityList.size());
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        System.out.println(cityList.toString());

        cityList.add(2, "Xian");
        System.out.println(cityList.toString());


        cityList.remove("Miami");
        System.out.println(cityList.toString());

        cityList.remove(1);
        System.out.println(cityList.toString());

        // Display the contents of the cityList in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.println(cityList.get(i) + " ");


        // Create a list to store two circles
        ArrayList<Circle> circles = new ArrayList<>();

        circles.add(new Circle(42));
        circles.add(new Circle(14));


        // Display the area of the first circle in the list
        System.out.println("The area of the circle? " + circles.get(0).getArea());

    }
}
