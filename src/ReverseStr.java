public class ReverseStr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Harsh");
        System.out.println(sb.reverse());

        String str1="Core2web";
        StringBuffer sb2= new StringBuffer(str1);
        str1=sb2.reverse().toString();
        System.out.println(str1);
    }
}
