package methods;

public class TestMethodOverLoading {

    public static void main(String[] args) {
        System.out.println(max(3, 7));
        System.out.println(max(10.0, 70.0));
        System.out.println(max(10.0, 70.0, 45.9));

        System.out.println((int)'a');
        System.out.println((int)'z');
    }

    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }


    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }

}