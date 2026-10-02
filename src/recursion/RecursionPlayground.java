package recursion;

public class RecursionPlayground {
    static void main(String[] args) {
        System.out.println(powerOfTwoRecursive(5));
        System.out.println(powerRecursive(2, 5));
        System.out.println(powerRecursive(2.5, 2));


        System.out.println(sumToNRecursive(5));
    }


    // Write a recursive mathematical definition for computing x^n for a non-negative integer n and a real number x
    public static double powerRecursive(double number, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else {
            return number * powerRecursive(number, (exponent - 1));
        }
    }

    // Write a recursive mathematical definition for computing 2^n for a non-negative integer n
    public static long powerOfTwoRecursive(int exponent) {
        if (exponent == 0) {
            return 1; // Base case
        } else {
            return 2 * powerOfTwoRecursive(exponent - 1);
        }

    }


   //  Write a recursive mathematical definition for computing 1 + 2 + 3 +...+ n for a positive integer n
    public static long sumToNRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumToNRecursive(n - 1);
        }
    }

}
