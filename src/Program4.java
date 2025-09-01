import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("enter the name  :");
        String name=br.readLine();

        System.out.println(name);

        System.out.println("enter the age :");

        int age = Integer.parseInt(br.readLine());

        System.out.println(age);
    }
    
}
