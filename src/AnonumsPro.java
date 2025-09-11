public class AnonumsPro {
    public static void main(String[] args) {
        Demo10 demo10=new Demo10(){
            @Override
            void marry() {
                super.marry();
                System.out.println("Hello");
            }
        };
        demo10.marry();

    }
}

class Demo10{
    void  marry(){
        System.out.println("Hi");
    }
}