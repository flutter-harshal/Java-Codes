public class program2 {
    public static void main(String[] args) {
        //int x=8;
        //int y=10;
       

        // System.out.println(--x);
        // System.out.println(++x);
        // System.out.println(++y);
        // System.out.println(--y);
// if(x>y){
//     System.out.println(x + " is greater");
// }else{
//     System.out.println(y +  "  is greater");
//}

// if (x%2==0) {
//     System.out.println("Even");
// }else{
//     System.out.println(" Odd");

// }

// while (i<=x) {
//     if (i%2!=0) {
//         System.out.println(i);
//          }i++;
//     }

// for(int i=1; i<=10; i++){
//     if (i%2==0) {
//         System.out.println(i);
        
//     }

// }

int N =22;
// int i =4;
// while (i<=N) {
//     System.out.println(i);
//     i=i+4;
// }

// int n =6531;
// while (n!=0) {
//     System.out.println(n%10);
//     n=n/10;
    
//}

int n =456;
int sum=1;
while (n!=0) {
    int temp=n%10;
    sum=sum*temp;
    n=n/10;
}
System.out.println(sum);
        
    }
}
