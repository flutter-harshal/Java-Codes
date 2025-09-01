public class Pro29 {

    static  int x =19;
    static  int y =20;

    static  void  display(){

        int z ;
        System.out.println(x);
        System.out.println(y);
    }
}

class  Client{
    public static void main(String[] args) {

        System.out.println(Pro29.x);
        System.out.println(Pro29.y);
        Pro29.display();
    }
}
