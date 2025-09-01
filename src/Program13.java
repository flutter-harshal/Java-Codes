public class Program13 {
    public static void main(String[] args) {
        // int arr[]= {10,20,30,40};
        // for (int i : arr) {
        //     System.out.println(arr[0]);
        //     System.out.println(i);
            
        // }

        Program13 obj = new Program13();
        int ret = obj.fun(10);
        System.out.println(obj.fun(10));
        System.out.println(ret);

    }

    int fun(int x){
        System.out.println("In fun");

        int value = x+10;
        return value;
        
    }





}
