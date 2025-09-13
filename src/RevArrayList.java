import java.util.ArrayList;
import java.util.Collections;

public class RevArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(2);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));


    Collections.reverse(arrayList);
        System.out.println(arrayList);

ArrayList<Integer> arrayList1=new ArrayList<>();
        for (int i = arrayList.size()-1; i>=0  ; i--) {
            arrayList1.add(arrayList.get(i));
        }
        System.out.println(arrayList1);

    }
}
