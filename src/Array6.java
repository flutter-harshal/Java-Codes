import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

//
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
