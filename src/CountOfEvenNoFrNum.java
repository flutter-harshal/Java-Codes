public class CountOfEvenNoFrNum {
    public static void main(String[] args) {
        int num=7367756;
        int EvenCount=0;
        int OddCount=0;

        while (num!=0){
            int rem=num%10;
            if (rem%2==0){
                EvenCount++;
            }else {
                OddCount++;
            }
            num=num/10;

        }
        System.out.println("Count of even number is :"+EvenCount);
        System.out.println("Count of odd number is :"+OddCount);

    }
}
