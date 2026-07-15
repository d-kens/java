package inheritance_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0) {
                list.add(value);
            }

        } while (value != 0);


        System.out.println("The distinct integers are: ");
        for (Integer listValue : list) {
            System.out.print(listValue + " ");
        }
    }
}
