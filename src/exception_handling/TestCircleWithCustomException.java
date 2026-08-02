package exception_handling;

public class TestCircleWithCustomException {

    public static void main(String[] args) {
        try {
            new CircleWithCustomException();
            new CircleWithCustomException(-5);
            new CircleWithCustomException(5);
        } catch(InvalidRadiusException exception) {
            System.out.println(exception);
        }

        System.out.println("Number of objects created " + CircleWithCustomException.getNumberOfObjects());
    }

}