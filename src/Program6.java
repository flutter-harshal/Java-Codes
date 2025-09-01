import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program6 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter match Info, Runs, MOM");

        String info= br.readLine();

        System.out.println(info);

        StringTokenizer obj = new StringTokenizer(info," , ");

        String token1 = obj.nextToken().trim(); // Match Info
            String token2 = obj.nextToken().trim(); // Runs
            String token3 = obj.nextToken().trim(); // MoM

            System.out.println("Match Info : " + token1);
            System.out.println("Match Runs : " + token2);
            System.out.println("Match MoM  : " + token3);


        
    }
}
