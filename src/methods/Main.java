package methods;

public class Main {

    public static void main(String[] args) {
        System.out.println(max(400, 500));
        System.out.println(max(800, 799));
    }

    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
