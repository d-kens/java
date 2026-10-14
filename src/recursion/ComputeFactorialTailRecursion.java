void main() {
    System.out.println(factorial(3));
    System.out.println(factorial(7));
}

public static long factorial(int n) {
    return factorial(n, 1);
}

private static long factorial(int n, int result) {
    if (n == 0) {
        return result;
    } else {
        return factorial(n - 1, n * result);
    }
}



