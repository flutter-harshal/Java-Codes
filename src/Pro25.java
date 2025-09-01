import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Pro25 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter match info,runs,Mom");

        String info= br.readLine();

        System.out.println(info);

        StringTokenizer stringTokenizer = new StringTokenizer(info,",");

        String token1 = stringTokenizer.nextToken();
        String token2 = stringTokenizer.nextToken();
        String token3 = stringTokenizer.nextToken();

        System.out.println("Match Info :"+ token1);
        System.out.println("Runs :"+ token2);
        System.out.println("Mom :"+ token3);

    }
}
