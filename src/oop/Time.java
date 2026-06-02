package oop;

public class Time {

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.getHour());

        Time time2 = new Time(555550000);
        System.out.println(time2.getHour());

        Time time3 = new Time(11, 20, 00);
        System.out.println(time3.getHour());
    }

    private long hour;
    private long minute;
    private long second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapsedTime) {
        long elapsedSeconds = elapsedTime / 1000;
        long elapsedMinutes = elapsedSeconds / 60;
        long elapsedHours = elapsedMinutes / 60;

        this.second = elapsedSeconds % 60;
        this.minute = elapsedMinutes % 60;
        this.hour = elapsedHours % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}
