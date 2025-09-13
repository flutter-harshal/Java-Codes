import java.util.ArrayList;

public class ArraySumPro {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(2);


        int sumOfEven =0;
        int sumOfOdd =0;

        for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i)%2==0){
                    sumOfEven=sumOfEven+arrayList.get(i);
                }else {
                    sumOfOdd=sumOfOdd+arrayList.get(i);
                }
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);


    }
}
