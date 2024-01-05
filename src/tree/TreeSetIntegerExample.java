package tree;

import java.util.TreeSet;

public class TreeSetIntegerExample {
    public static void main(String[] args) {
        // Creating a TreeSet for integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding integers to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(5);


        // Printing the elements of the TreeSet (sorted order)
        System.out.println("TreeSet elements (sorted order): " + treeSet);




    }
}
