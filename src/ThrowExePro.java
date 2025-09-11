import java.util.Scanner;

public class ThrowExePro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        try {
            if (x==0){
                throw new ArithmeticException("Devide by 0");
            }
            System.out.println(10/x);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
