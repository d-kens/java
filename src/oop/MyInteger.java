package oop;

public class MyInteger {

    public static void main(String[] args) {
        MyInteger integer = new MyInteger(2);
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());
    }

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger integer) {
        return isEven(integer.value);
    }

    public static boolean isOdd(MyInteger integer) {
        return isOdd(integer.value);
    }

    public static boolean isPrime(MyInteger integer) {
        return isPrime(integer.value);
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger integer) {
        return this.value == integer.value;
    }

    public static int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars){
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static int parseInt(String s) {
        return parseInt(s.toCharArray());
    }
}

