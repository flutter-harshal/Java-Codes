import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int count=0;
        int num= sc.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime no");
        }else {
            System.out.println("Not prime");
        }

    }
}
