import java.util.Arrays;

public class ProgramArray {

    static  void  fun(int[] arr){
        for(int x : arr){
            System.out.println(x);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+10;
            System.out.println(arr[i]);

        }
    }





    public static void main(String[] args) {
        int[] arr ={10,28,69};
        fun(arr);
    }
}


