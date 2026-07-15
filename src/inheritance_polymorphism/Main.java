package inheritance_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(45.90);
        list.add(0, 20.0);
        System.out.println(list.size());
        list.remove(20.0);
        list.removeLast();
        System.out.println(list.contains(20.0));
        list.add(30.0);
        list.add(67.0);
        System.out.println(list.get(1));


        for (Double value : list) {
            System.out.print(value + " ");
        }

        System.out.println();

        String[] colors = {"red", "green", "white", "yellow", "black"};
        ArrayList<String> listOfColors = new ArrayList<>(Arrays.asList(colors));

        for (String color : listOfColors) {
            System.out.print(color + " ");
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        Integer[] values = new Integer[numbers.size()];
        numbers.toArray(values);
    }
}
