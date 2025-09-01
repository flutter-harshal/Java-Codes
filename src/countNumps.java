/*
import java.util.Scanner;

public class countNumps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num;
        num = sc.nextLong();

        int count =0;
        /* int rem=1; * /
        while(num>0){
        long rem= (long)(num % 10);
            if(rem==4){
                count++;
            }
            num=num/10;

        }
        System.out.println(count);

    }
}
*/


import java.util.Scanner;

public class countNumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number as a String
        String num = sc.nextLine();

        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '4') {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
