import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 0:
            case 6:
                System.out.println("Weekend");
        }


        System.out.println("He said \"Java is fun\"");



        int count = 0;

        while (count < 100) {
            System.out.println("You are awesome");
            count++;
        }


        int sum  = 0, i = 1;

        while (i < 10) {
            sum += i;
            i++;
        }

        System.out.println("The sum is " + sum);
    }

}
