public class Pro20 {
    public static void main(String[] args) {
        int n=135;
        int Mul=1;
        while (n!=0){
            int rem=n%10;
            Mul=Mul*rem;
            n=n/10;
        }
        System.out.println(Mul);
    }
}
