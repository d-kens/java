package loops;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;


        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be Ksh %.2f in years %1d", tuition, year);

    }
}
