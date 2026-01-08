package arrays;

public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(5, 1,2,4 ,69, 90);
        printMax(new double[]{10, 67, 220, 70, 90});
    }

    public static void printMax(double...values) {
        if (values.length == 0) {
            System.out.println("No arguments passed");
        }

        double result = values[0];

        for (int i = 1; i < values.length; i++)
            if (values[i] > result)
                result = values[i];

        System.out.println("The max value is: " + result);
    }
}