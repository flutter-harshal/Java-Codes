import java.util.ArrayList;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(10);

        System.out.println("The Normal array is : " + arrayList);

        ArrayList<Integer> arrayList1= new ArrayList<>();
        ArrayList<Integer> arrayList2= new ArrayList<>();


        for(int num: arrayList){
            if(num%2==0){
                arrayList1.add(num);

            }else {
                arrayList2.add(num);
            }
        }

        System.out.println("Even number array is " + arrayList1);

        System.out.println("Odd number array is " + arrayList2);

    }
}
