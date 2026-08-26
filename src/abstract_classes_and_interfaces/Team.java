package abstract_classes_and_interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Shallow Copy
 - A shallow copy duplicates the outer object and its fields as is. For primitives (int, boolean), this means the actual values are duplicated.
 But for fields that are references (Objects, arrays, lists), only the reference is copied, not the object it points to. So the original and the
 copy end up pointing to the same underlying object in memory.

 * Deep Copy
 - A deep copy duplicates the outer object and recursively duplicates everything it references, so the copy is fully independent - no shared mutable
 state anywhere in the object graph
 */

public class Team implements Cloneable {
    String name;
    List<String> members;


    // Shallow Copy
//    @Override
//    public Team clone() throws CloneNotSupportedException {
//        return (Team) super.clone();
//    }


    // Deep Copy
    @Override
    public Team clone() throws CloneNotSupportedException {
        Team copy = (Team) super.clone(); // shallow copy
        copy.members = new ArrayList<>(this.members); // now manually deep-copy the mutable field
        return copy;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Team original = new Team();
        original.name = "Alpha";
        original.members = new ArrayList<>(List.of("Alice", "Bob"));

        Team copy = original.clone();
        copy.members.add("Charlie");

        System.out.println(original.members);
    }
}
