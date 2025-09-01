public class Abstra {
    public static void main(String[] args) {

        Parent1 obj = new Child1();
        obj.carrier();
        obj.marry();

    }
}

abstract  class Parent1{
    void carrier(){
        System.out.println("Doctor");
    }

   abstract void  marry();

}

class  Child1 extends  Parent1{
    void  marry(){
        System.out.println("Mrunal");
    }
}