/***
 Finding the greatest Common Divisor
 - The GCD of 4 and 2 is 2
 - The GCD of 16 and 24 is 8

 Logical Solution
 - Let the two integers be n1 and n2
 - 1 is a  common divisor, but it might not be the greatest common divisor.
 - We need to find a number k ( from k = 2, 3, 4, 5 and so on) that divides both n1 and n2.
 - We do this until k is greater than n1 or n2
 - Store the common divisor in a variable named gcd, initially the gcd is 1 and whenever a new divisor is found, it becomes the new gcd.
 - When we have checked all the possible common divisors from 2 to n1 or n2, the value in the variable gcd is the greatest common divisor.
 */


package loops;

public class GCD {
    public static void main(String[] args) {

        int n1 = 125;
        int n2 = 2525;

        int gcd = 1;
        int  k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        System.out.println("Teh GCD for " + n1 + " and " + n2 + " is " + gcd);

    }
}