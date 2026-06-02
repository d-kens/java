package oop;

public class StringBuilderLearn {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        stringBuilder.insert(7, ' ');
        stringBuilder.insert(15, " and DSA");
        System.out.println(stringBuilder);
        stringBuilder.delete(15, 23);
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);
        stringBuilder.replace(0, 5, "WEROCAM");
        System.out.println(stringBuilder);
    }
}
