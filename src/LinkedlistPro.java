
import java.util.LinkedList;

public class LinkedlistPro {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Display list
        System.out.println("Fruits: " + list);

        // Remove element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Access element
        System.out.println("First Fruit: " + list.getFirst());
        System.out.println("Last Fruit: " + list.getLast());
    }
}
