public class InnerClaPro {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.m2();

        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.m1();

    }
}
class  Outer1{
    class Inner1{
        void  m1(){
            System.out.println("In m1 Inner");
        }
    }

    void  m2(){
        System.out.println("In m2 outer");
    }

}