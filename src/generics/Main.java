package generics;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Dickens");

        ArrayList dates = new ArrayList(); // raw type, no type parameter is given. Without type parameter, the compiler treats it as a list holding Object.
        dates.add(new Date());
        Date date = dates.get(0);
    }

}
