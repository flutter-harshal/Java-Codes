import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the batsman");
        String name = br.readLine();

        System.out.println("Enter the name of the batsman");
        String name1 = br.readLine();

        System.out.println("Name of the batsman is " + name);
        System.out.println("Name of the bowler is : "+ name1);
    }
    
}
