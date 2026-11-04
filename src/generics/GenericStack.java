package generics;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list  = new ArrayList<>();


    public int getSize() {
        return list.size();
    }

    public E peek() { // Returns the top element of the stack
        return list.get(getSize() - 1);
    }

    public E pop() { // Returns and removes the top element of the stack
        return list.remove(getSize() - 1);
    }

    public void push(E object) {
        list.add(object);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    static void main(String[] args) {

        GenericStack<String> names = new GenericStack<>();
        names.push("Dickens");
        names.push("Jane");
        names.push("Luke");
        names.push("Kimberly");


        GenericStack<Integer> values = new GenericStack<>();
        values.push(100);
        values.push(106);
        values.push(34);
        values.push(342);

    }
}
