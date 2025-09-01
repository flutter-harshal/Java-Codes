import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[]= new int[4];
        int sum=0;
        for(int i =0; i<arr.length; i++){
            arr[i]= Integer.parseInt(br.readLine());
            sum= arr[i]+sum;
        }
        System.out.println("sum is :" + sum);

        
       
    }
    
}
