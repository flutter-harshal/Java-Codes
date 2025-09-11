import java.util.ArrayList;
import java.util.Iterator;

public class CursorPro {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(10.0);
        arrayList.add(20);
        arrayList.add(34.5f);
        arrayList.add("Harsh");

        for (Object x : arrayList){
            System.out.println(x.getClass().getName());

        }

        Iterator<Object> itr = arrayList.iterator();
        while (itr.hasNext()){
                  if("C2w".equals(itr.next())) {
                      itr.remove();
                  }
            System.out.println(arrayList);

        }
    }
}
