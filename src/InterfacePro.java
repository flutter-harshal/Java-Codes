public class InterfacePro {
    public static void main(String[] args) {

        DemoChild obj = new DemoChild();
        obj.fun();

    }
}

interface  Demo1{
    void  fun();
}
interface Demo2{
    void  fun();
}

class DemoChild implements Demo1,Demo2{
    @Override
    public void fun() {
        System.out.println("In fun child");
    }
}