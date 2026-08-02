package exception_handling;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.out.println("Printing stack trace.......");
            exception.printStackTrace();
            System.out.println("Stack trace printed........");
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("New info from method 1", exception);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method 2");
    }
}
