package abstract_classes_interfaces;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities =  {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);

        for (String city: cities)
            System.out.println(city + " ");

        System.out.println();

        BigInteger[] hugeNumbers = { new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292") };
        java.util.Arrays.sort(hugeNumbers);

        for (BigInteger number: hugeNumbers)
            System.out.println(number + " ");


        System.out.println();

        ComparableRectangle[] comparableRectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };

        java.util.Arrays.sort(comparableRectangles);

        for (Rectangle rectangle: comparableRectangles)  {
            System.out.println(rectangle + " ");
            System.out.println();
        }
    }
}
