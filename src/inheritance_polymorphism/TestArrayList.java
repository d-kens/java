package inheritance_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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


        ArrayList<String> list = new ArrayList<>();

        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");



        System.out.println(list.toString());

//        for (int i = 0; i < list.size(); i++)
//            list.remove("Dallas");

        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).equals("Dallas"))
                list.remove(i);
        }

        System.out.println(list.toString());




        // Useful methods for lists
        String[] colors = { "red", "green", "blue" };
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));
        System.out.println(colorsList.toString());

        colorsList.add("white");
        colorsList.add("yellow");

        System.out.println(colorsList.toString());

        String[] colors1 = new String[colorsList.size()];
        colorsList.toArray(colors1);

        for (String color: colors1) System.out.print(color + " ");

        Collections.sort(colorsList);
        System.out.println(colorsList.toString());

        System.out.println(Collections.max(colorsList));
        System.out.println(Collections.min(colorsList));

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(new Integer[]{20,50, 67, 12, 36, 400, 98, 76, 909, 87, 67, 45}));
        Collections.shuffle(values);
        System.out.println(values.toString());

    }
}
