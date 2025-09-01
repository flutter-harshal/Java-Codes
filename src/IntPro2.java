public class IntPro2 {
    public static void main(String[] args) {
        Dog1 obj= new Dog1();
        obj.sound();

    }
}

interface  Animal1{
    static void sound() {

    }
}

class Dog1 implements  Animal1{
   public void sound(){
       System.out.println("Dog bark");
    }
}