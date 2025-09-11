import java.util.Scanner;

public class Palindromprog {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
         int num = sc.nextInt();
         int rev=0;
         int temp=num;
         while (num!=0){
             int rem = num%10;
             rev = rev*10+rem;
             num=num/10;
         }

         if (temp==rev){
             System.out.println("Palindrom");
         }else {
             System.out.println("Not Palindrom");
         }
    }
}
