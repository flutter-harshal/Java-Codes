import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[]= new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
