package oop;

public class StackOfIntegers {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(5);

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }



    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public int pop() {
        return elements[--size];
    }

    public void push(int value) {
        if (size >= elements.length) {
            System.out.println("This has been evaluated");
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int getSize() {
        return size;
    }
}
