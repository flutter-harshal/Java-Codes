import java.util.ArrayList;
import java.util.Iterator;

public class Prp32 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("HArsh");
        al.add("Rina");
        al.add("Sonu");

        System.out.println(al);

        Iterator<String> itr =al.iterator();

        while (itr.hasNext()){
            if("Harsh".equals(itr.next())){
                itr.remove();
                System.out.println(itr.next());
            }
            System.out.println(al);
        }


    }
}
