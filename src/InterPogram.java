public class InterPogram {
    public static void main(String[] args) {
        Demochild1 obj= new Demochild1();
        obj.gun();
        obj.fun();

    }
}

interface  Demo9{
    void  gun();
    void fun();

}

abstract  class Demochild implements Demo9{
    @Override
    public void fun() {
        System.out.println("In gun");
    }
}

class Demochild1 extends Demochild{

    @Override
    public void gun() {
        System.out.println("In gun");
    }
}