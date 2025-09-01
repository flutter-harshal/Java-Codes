package Switch;

import java.util.Scanner;

public class fruits
{
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String fruit = sc.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("Sweet fruit");
                break;
            case "Orange":
                System.out.println("Tasty food");
                break;
            case "Grapes":
                System.out.println("king of fruits");
                break;
        }
    }
}
