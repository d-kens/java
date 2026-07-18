package inheritance_polymorphism;

class MyDate {
    private int year, month, day;
    public MyDate() { this(System.currentTimeMillis()); }
    public MyDate(long elapsedTime) {
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(java.util.Calendar.YEAR);
        month = cal.get(java.util.Calendar.MONTH);
        day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    }
    @Override
    public String toString() { return (month + 1) + "/" + day + "/" + year; }
}