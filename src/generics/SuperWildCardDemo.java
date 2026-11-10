import generics.GenericStack;

void main() {

    GenericStack<String> stack1 = new GenericStack<>();
    GenericStack<Object> stack2 = new GenericStack<>();

    stack2.push("Java");
    stack2.push(2);
    stack1.push("Sun");

    add(stack1, stack2);

    while (!stack2.isEmpty()){
        System.out.println(stack2.pop() + " ");
    }
}


/**
 * Moves all elements from stack1 into stack2
 * <? super T> - A lower-bound wildcard: stack2 may hold T or any supertype of T
 * With GenericStack<T> stack2 instead, add(GenericStack<String>, GenericStack<Object>) would not compile.
 */
public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
    while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
    }
}