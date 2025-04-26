package inheritance_polymorphism;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        return list.remove(getSize() - 1);
    }

    public void push(Object object) {
        list.add(object);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
