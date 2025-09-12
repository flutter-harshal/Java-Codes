import java.util.ArrayList;
import java.util.Scanner;

public class CountArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Array size");
        int size = scanner.nextInt();
        ArrayList<Object> arrayList= new ArrayList<>();

        for (int i=0; i<size;i++){
          arrayList.add(scanner.nextInt());
           // System.out.println(arrayList.get(i));

        }
        System.out.println(arrayList);

    }
}
