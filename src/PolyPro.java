public class PolyPro {
    public static void main(String[] args) {

        Animal2 obj= new Dog2();
        obj.sound();

    }
}

class  Animal2 {
    public  void sound(){
        System.out.println("Animal bark");
    }
}

class Dog2 extends  Animal2{
    @Override
    public void sound() {
        System.out.println("Dog bark");

    }
}

