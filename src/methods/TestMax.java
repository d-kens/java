package methods;

public class TestMax {
    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 333;
        int max = max(number1, number2);

        System.out.printf("The maximum of " + number1 + " and " + number2 + " is " + max);
    }


    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
