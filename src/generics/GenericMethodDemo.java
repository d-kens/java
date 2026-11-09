void main() {

    Integer[] integers = { 1, 2, 3, 4, 5, 6};
    String[] strings = {"London", "Paris", "New York", "Austin"};

    print(integers);
    print(strings);
}


/***
 * TO define a generic method, you place the generic type <E> immediately after the keyword static in the method header
 * @param list
 * @param <E>
 */
public static <E> void print(E[] list) {
    for (int i = 0; i < list.length; i++) {
        System.out.println(list[i] + " ");
    }
    System.out.println();
}