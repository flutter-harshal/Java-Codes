import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPro {
    public static void main(String[] args) throws IOException {
        Demo6 demo = new Demo6();
        demo.getData();

    }
}

class  Demo6 {
    void  getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data=0;

        try{
            data=Integer.parseInt(br.readLine());

        }catch(NumberFormatException obj){
            System.out.println(obj);

        }

        System.out.println(data);
    }
}