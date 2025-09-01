public class Poly {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();

    }
}

class  Animal{
    void  sound(){
        System.out.println("Animals sounds :");
    }

}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog bark");

    }
}