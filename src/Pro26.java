import java.util.Scanner;
import java.util.StringTokenizer;

public class Pro26 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the player info: ");

        String str = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

        System.out.println(stringTokenizer.countTokens());

        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
