import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add(33);
        linkedHashSet.add(333);
        linkedHashSet.add(null);
        linkedHashSet.add(0);
        linkedHashSet.add(44);
        linkedHashSet.add(45);
        linkedHashSet.add(33);

        // Printing the elements of the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

    }
}

