package generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    static void main(String[] args) {
        // K and V can be different types
        Pair<String, Integer> population = new Pair<>("Nairobi", 4_397_073);
        String city = population.getKey();
        int numberOfPeople = population.getValue();
        System.out.println(city + " -> " + numberOfPeople);

        // Type safety: this line fails to compile
//        population.setValue("four million"); // String cannot be converted to integer


        // K and V can be the same types
        Pair<String, String> capital = new Pair<>("Kenya", "Nairobi");
        System.out.println(capital);

        // A type argument itself can be a generic type
        Pair<String, GenericStack<Integer>>  scores = new Pair<>("scores", new GenericStack<>());
        scores.getValue().push(100);
        scores.getValue().push(90);
        System.out.println(scores);


    }

}
