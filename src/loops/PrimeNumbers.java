/*
  - A program that displays the first 100 primes in 5 lines, each containing 10 numbers.
  - A prime number is  number with only two factors, 1 and itself.
  - Algorithm:
        Set the number of prime numbers to be printed as a constant NUMBER_OF_PRIMES
        Use count to track the number of prime numbers and set an initial count to 0
        Set an initial number to 2.

        while (count < NUMBER_OF_PRIMES) {
            Test whether number is prime

            if number is prime {
                Display the prime number and increase the count
            }

            Increment number by 1.
        }

        To test whether a number is prime, check whether it is divisible by 2,3,4,5, and so on until number/2. If a divisor is found the number is not prime.
        Use a boolean variable isPrime to denote whether the number is prime; Set isPrime to true initially
         for (int divisor = 2, divisor <= number /2; divisor++) {
            if (number % divisor == 0) {
                Set isPrime to false
                Exit the loop
            }
         }
 */

package loops;

public class PrimeNumbers {
    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 100;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;


        System.out.println("The first 100 prime numbers are: ");

        while(count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            number++;
        }
    }
}