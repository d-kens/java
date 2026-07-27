package exception_handling;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException circle1 = new CircleWithException(5);
            CircleWithException circle2 = new CircleWithException(-5);
            CircleWithException circle3 = new CircleWithException(0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }

        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());


    }
}
