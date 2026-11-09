void main() {

    Integer[] intArray = { 30, 12, 1, 15, 60, 37 };
    Double[] doubleArray = { 3.4, 1.3, -22.1 };
    Character[] charArray = { 'a', 'J', 'r' };

    sort(intArray);
    sort(doubleArray);
    sort(charArray);

    printList(intArray);
    printList(doubleArray);
    printList(charArray);
}


public static <E extends Comparable<E>> void sort(E[] list) {
    E currentMin;
    int currentMinIndex;

    for (int i = 0; i < list.length - 1; i++) {
        currentMin = list[i];
        currentMinIndex = i;

        for (int j = i + 1; j < list.length; j++) {
            if (currentMin.compareTo(list[j]) > 0) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }

        // Swap list[i] with list[currentMinIndex] if necessary
        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }

}

public static void printList(Object[] list) {
    for (int i = 0; i < list.length; i++) {
        System.out.println(list[i] + " ");
    }
    System.out.println();
}