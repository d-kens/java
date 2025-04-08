package fundamentals;

public class BMI {
    public static double computeBMI(double weight, double height) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return Math.round(bmi * 100) / 100.0;
    }


    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }


    public static void main(String[] args) {

        String name1 = "Kim Yang";
        double weight1 = 145;
        double height1 = 70;

        double bmi1 = computeBMI(weight1, height1);

        System.out.println("The BMI for " + name1 + " is " + "bmi " + bmi1 + " " + getBMIStatus(bmi1));


        String name2 = "Susan King";
        double weight2 = 215;
        double height2 = 70;

        double bmi2 = computeBMI(weight2, height2);

        System.out.println("The BMI for " + name2 + " is " + "bmi " + bmi2 + " " + getBMIStatus(bmi2));





    }
}
