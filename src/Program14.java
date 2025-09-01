public class Program14 {
    // static  int fun(int x, int y){
    //     int sum = x+y;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //    int ans= fun(10, 20);
    //     System.out.println(ans);
    // }


    static void fun(int x, int y){
        System.out.println(x);
        System.out.println(y);
        x=x+10;
        System.out.println(x);
        y=y+10;
        System.out.println(y);
    }

    public static void main(String[] args) {
        int x=10;
        int y = 20;
        System.out.println(x);
        System.out.println(y);


        fun(x, y);
        System.out.println(x);
        System.out.println(y);
    }
}
