package methods;

// Demonstrates the effects of pass by value

public class Increment {
    public static void main(String[] args){
        int x = 1;
        System.out.println("x before the call is " + x);
        increment(x);
        System.out.println("x after the call is " + x);


        int times = 3; System.out.println("Before the call,"
                + " variable times is " + times);
        // Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times); System.out.println("After the call,"
                + " variable times is " + times);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }

    public static void nPrintln( String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
}