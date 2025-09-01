import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sixe of the Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        int Evencount=0;
        int OddCount=0;

        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                Evencount++;
            }
            else{
                OddCount++;
            }
           
        }
         System.out.println("Even Count is :" +Evencount);
         System.out.println("Odd count is :" + OddCount);



    }
}
