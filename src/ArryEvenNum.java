    import java.util.ArrayList;

    public class ArryEvenNum {
        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(9);
            arrayList.add(10);

            System.out.println("The Normal array is :" + arrayList);
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int i =0;i< arrayList.size(); i++){
                if(arrayList.get(i)%2 ==0){
                  arrayList1.add(arrayList.get(i));
                }

            }
            System.out.println("Even no in array is :" + arrayList1);



        }
    }
