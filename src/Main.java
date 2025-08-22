import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean success = false;

        do {
            System.out.println("Enter Your Recent Income");
            String input = scanner.nextLine(); // safer

            try {
                float income = Float.parseFloat(input);
                var tithe = income * 0.1;
                var outputAmount = String.format("Kes. %.2f", tithe);

                System.out.println(outputAmount);

                success = true;
            } catch (NumberFormatException ex) {
                var errorMsg = String.format("System failure! Invalid input %s! Use a number", input);
                System.err.println(errorMsg);
            }
        } while (!success);
    }

}
