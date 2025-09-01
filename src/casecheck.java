import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch= in.next().trim().charAt(0);


        if(ch >= 'a' && ch <='z'){
            System.out.println(ch + " : " + "is LOWERCASE");

        }else {
            System.out.println(ch + " : " + "is UPPERCASE");
        }
    }
}
