import java.util.ArrayList;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(10);

        //input
        for (int i = 0; i <5 ; i++) {
            arr.add(sc.nextInt());


        }
        System.out.println(arr);

        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i)); //pass index here
        }

        System.out.println(arr);
        arr.add(10);
        arr.add(34);
        System.out.println(arr);
        System.out.println(arr.contains(30));

        System.out.println(arr.set(1,45));

        System.out.println(arr);
    }
}
