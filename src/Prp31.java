public class Prp31 {
    public static void main(String[] args) {
        Child4 ch = new Child4();

        System.out.println(ch.num(3,5));


    }
}

class  Parent4{
    Parent4(){
        super();
        System.out.println("In Parent");
    }
    int num(int a , int b){
        return a+b;
    }
}

class  Child4 extends Parent4{
    Child4(){
        super();
        System.out.println("In Child");
    }
    int num(int a , int b){

        return a+b;
    }
}