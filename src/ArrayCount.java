import java.util.ArrayList;

public class ArrayCount {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(10);

        System.out.println(arrayList);

        int Evencount =0;
        int OddCount=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0){
                Evencount++;
            }else {
                OddCount++;
            }

        }
        System.out.println("Even num count is :"+ Evencount);
        System.out.println("Odd num count is :"+ OddCount);
    }
}
