import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // int arr1[] ={10,20,30,40};

        // System.out.println("For loop");
        
        // for(int i =0; i<arr1.length; i++){
        //     System.out.println(arr1[i]);
        // }
Scanner sc = new Scanner(System.in);

int arr[]= new int[4];

arr[0]= sc.nextInt();
arr[1]= sc.nextInt();
arr[2]= sc.nextInt();
arr[3]= sc.nextInt();

for(int i=0; i<arr.length;i++){
    System.out.println(arr[i]);
}


    }
}
