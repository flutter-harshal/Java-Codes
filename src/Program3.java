import java.util.Scanner;

public class Program3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);

        System.out.println("Company you want :");
        String name = obj.next();

        System.out.println("package you want :");
        int salary =obj.nextInt();

        System.out.println(name);
        System.out.println(salary);


        }
}
