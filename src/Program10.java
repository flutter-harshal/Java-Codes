import java.util.Scanner;

public class Program10 {
//     static void add(int a, int b){
//         int ans = a+ b;
//         System.out.println(ans);
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         add(a, b);
    //}

     void sub(int a, int b){
        int ans = a-b;
        System.out.println(ans);
    }

    static void mul(int a, int b){
        int ans = a*b;
        System.out.println(ans);
    }

    static void div(int a, int b){
        int ans = a/b;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Program10 obj = new Program10();


        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.sub(a, b);
        div(a, b);
        mul(a, b);
    }



}
