public class Program9 {
    int x= 9;
    static int y =19;

    void fun(){
        System.out.println("In fun method");
        System.out.println(y);
    }

    static void gun(){
        System.out.println("In gun method");
    }

    public static void main(String[] args) {
    
        Program9 obj = new Program9();

        System.out.println(obj.x);
        System.out.println(y);
        obj.fun();
        gun();
        
    }

}

