import java.util.Scanner;

public class NumException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string= sc.next();
        int data=0;
        try {
            data = sc.nextInt();
        }catch (NumberFormatException numberFormatException){
            System.out.println("Please enter the Integer data");
            data= sc.nextInt();
        }
        System.out.println(data);
    }
}


