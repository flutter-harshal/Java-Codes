import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program7 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));

        // System.out.println("Enter Mall name,wing,Shop no");
        // String str = br.readLine();
        // System.out.println(str);

        // StringTokenizer obj=new StringTokenizer(str,",");

        // String token1= obj.nextToken().trim();

        // String token2= obj.nextToken().trim();
        // //Character ch = token2.charAt(0);

        // String token3= obj.nextToken().trim();
        // //int  num = Integer.parseInt(token3);

        // System.out.println("Mall name :"+ token1);
        // System.out.println("Mall Wing :"+ token2);
        // System.out.println("Mall ShopNo :"+ token3);

        System.out.println("Enter the player info");
        String name = br.readLine();


        StringTokenizer st = new StringTokenizer(name, ",");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            
        }

        
    }
}
