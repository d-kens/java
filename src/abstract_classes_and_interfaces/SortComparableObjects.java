import abstract_classes_and_interfaces.ComparableRectangle;

import java.math.BigInteger;
import java.util.Arrays;

void main() {

    String[] cities = { "Nairobi", "Webuye", "Nakuru", "Kisumu","Mombasa"};
    Arrays.sort(cities);

    for (String city : cities) {
        System.out.print(city + " ");
    }
    System.out.println();

    BigInteger[] hugeNumbers = { new BigInteger("656896354917655"), new BigInteger("41542453563467897656"), new BigInteger("8986454012546"), new BigInteger("132456") };
    Arrays.sort(hugeNumbers);

    for (BigInteger number : hugeNumbers) {
        System.out.print(number + " ");
    }
    System.out.println();

    ComparableRectangle[] rectangles = {
            new ComparableRectangle(40, 23.3),
            new ComparableRectangle(41, 21),
            new ComparableRectangle(10, 2.1)
    };

    Arrays.sort(rectangles);

    for (ComparableRectangle rectangle : rectangles) {
        System.out.print(rectangle + " ");
        System.out.println();
    }

}