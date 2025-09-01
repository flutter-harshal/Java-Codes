import java.util.Scanner;
import java.util.zip.DataFormatException;

public class ExceptionPro1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer Value");

        for(int i=0;i< arr.length;i++){
            int data=  scanner.nextInt();

            if(data<0){
                throw  new DataUnderflowException("Data is less than 0");
            }
            if (data>100){
                throw  new DataOverflowException("Data is greater than 100");

            }
            arr[i]=data;
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}

class  DataUnderflowException extends RuntimeException{
    DataUnderflowException(String msg){
        super(msg);
    }
}
class  DataOverflowException extends RuntimeException{
    DataOverflowException(String msg){
        super(msg);
    }
}
