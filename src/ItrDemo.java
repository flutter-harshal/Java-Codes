import java.util.*;

public class ItrDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list);

        // Using Iterator
        Iterator  itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
