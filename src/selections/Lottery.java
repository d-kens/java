package selections;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 100);

        while (lottery > 10) {
            lottery = (int)(Math.random() * 100);
        }

        System.out.println(lottery);
    }
}
