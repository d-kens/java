package oop;


public class Main {
    public static void main(String [] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(30_000);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);

        System.out.println(wage);


        var browser = new Browser();
        browser.navigate("http://oro.co.ke/");
    }
}
