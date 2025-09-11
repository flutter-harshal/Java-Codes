
public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb =  new StringBuffer();

        System.out.println(sb.capacity());
        sb.append("Harsh");
        System.out.println(sb.capacity());
        sb.append("Nahire");
        System.out.println(sb.capacity());
        System.out.println(sb);

    }
}
