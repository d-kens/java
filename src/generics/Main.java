package generics;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(); // Parameterized type
        ArrayList dates  = new ArrayList(); // Raw type - A generic class used without specifying the type parameter. The compiler treats it as a list holding object.


        dates.add(new Date());
        dates.add("not a date");

        // Date date = dates.get(0); // compiler error, get returns an Object on raw types so a cast is needed
        Date date = (Date) dates.get(0);
    }

}
