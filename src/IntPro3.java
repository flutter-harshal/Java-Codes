public class IntPro3 {
    public static void main(String[] args) {
        Demochild2 obj = new Demochild2();
        obj.fun();
    }
}

interface Demo3{
    int x=10;
    void  fun();
}

class  Demochild2 implements Demo3{
    @Override
    public void fun() {
        System.out.println("In fun");
        System.out.println(Demo3.x);
    }

}