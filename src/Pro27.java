import java.util.Scanner;

public class Pro27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thee size of the Array");
        int size= sc.nextInt();

        int[] arr= new  int[size];

        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int count=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==1){
                count++;
            }

        }
        System.out.println(count);

    }
}
