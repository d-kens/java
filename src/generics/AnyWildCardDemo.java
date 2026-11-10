import generics.GenericStack;

void main() {

    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(-2);

    print(intStack);

}

/**
 * Prints Objects and empties the stack
 * <?> - A wildcard that represents any object type. It is eqivalent to <? extends Object?
 * **/
public static void print(GenericStack<?> stack) {
    while (!stack.isEmpty()) {
        System.out.println(stack.pop() + " ");
    }
}