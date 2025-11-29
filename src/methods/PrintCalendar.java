package methods;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        printMonth(2025, 11);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("                   " + getMonthName(month) + " " + year);
        System.out.println("------------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDayInMonth = getNumberOfDaysInMonth(year, month);

        // Pad Space Before The First day of the month
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= numberOfDayInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_1_JAN_1800 = 3;

        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays % 7) + START_DAY_FOR_1_JAN_1800;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }

        for (int i = 1; i < month; i++)
            total += getNumberOfDaysInMonth(year, i);


        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}