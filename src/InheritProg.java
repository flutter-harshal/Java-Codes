public class InheritProg {
    public static void main(String[] args) {

        Child7 obi = new Child7();
        obi.gun();
        obi.fun();

    }
}

class  Parent7{
     int x=10;
    static  int y =20;
    Parent7(){
        System.out.println("In parent const");
    }
    void  fun(){
        int sum= x+ y;
        System.out.println(sum);

    }


}

class  Child7 extends Parent7{
    Child7(){
        super();
    }

    void  gun(){
        System.out.println("Gun method");
    }
}
