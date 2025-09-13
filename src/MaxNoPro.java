import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MaxNoPro {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();

        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(50);
        arrayList.add(40);
        arrayList.add(76);
        arrayList.add(5);


        int max= arrayList.get(0);
        for (int i=1;i<arrayList.size(); i++){
if(arrayList.get(i)>max){
    max=arrayList.get(i);
}
        }
        System.out.println(max);

//        Iterator itr = arrayList.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        int smallest = Collections.min(arrayList);
        System.out.println(smallest);

        int min=arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {

            if(arrayList.get(i)<min){
                min=arrayList.get(i);
            }

        }
        System.out.println(min);

    }
}
