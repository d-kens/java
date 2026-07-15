package inheritance_polymorphism;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities to the List
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the List? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Xian");

        // Remove a city from the list
        cityList.remove("Miami");

        // Remove a city at index 1
        cityList.remove(1);

        // Display the contents in the list
        System.out.println(cityList); // System.out.println(cityList.toString())

        // Display the contents of the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");

        // Create a list to store two circles
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(42));
        circles.add(new Circle(84));

        // Display the area of the first circle in the list
        System.out.println(circles.get(0).getArea());
    }
}
