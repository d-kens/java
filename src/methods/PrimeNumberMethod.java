package methods;

public class PrimeNumberMethod {

    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumber(50);
    }

    public static void printPrimeNumber(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.print(number + "\n");
                else
                    System.out.print(number + " ");
            }

            number++;
        }
    }

    public static boolean isPrime(int number) {
        int k = 2;

        while (k <= number / 2) {
            if (number % k == 0 )
                return false;

            k++;
        }

        return true;
    }
}