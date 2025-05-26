package abstract_classes_interfaces;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>(); // Can store all the subclasses of number

        list.add(45);
        list.add(3445.53);

        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " + getLargetsNumber(list));
    }


    public static Number getLargetsNumber(ArrayList<Number> list) {
        if(list == null || list.isEmpty())
            return null;

        Number number = list.getFirst();

        for (int i = 1; i < list.size(); i++)
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);

        return number;
    }
}
