public class Pro22 {
    public static void main(String[] args) {
        int n=2445442;
        int rev=0;
        int temp=n;
        while (n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrom number");
        }else {
            System.out.println("Not Palindrom number");
        }
    }
}
