import java.util.LinkedList;
import java.util.ListIterator;

public class ListItrDemo {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");

            System.out.println(list);
            list.addFirst("D");
            System.out.println(list);
           

            // Using ListIterator
            ListIterator<String> li = list.listIterator();

            System.out.println("Forward:");
            while(li.hasNext()) {
                System.out.println(li.next());
            }

            System.out.println("Backward:");
            while(li.hasPrevious()) {
                System.out.println(li.previous());
            }
        }
    }

