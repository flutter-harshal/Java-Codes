public class IneerClass {
    public static void main(String[] args) {
        Outer obj= new Outer();
        Outer.Inner inner= obj.new Inner();
        inner.sound();

    }
}

class  Outer{
    private  String name="Hello from outer";

    class Inner{
        void sound(){
            System.out.println(name);
        }
    }
}
