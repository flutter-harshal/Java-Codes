public class Inherit1 {
    public static void main(String[] args) {
        Bcci bc = new Bcci();
        bc.tour();


    }
}

class  Icc{
    Icc(){
        System.out.println("In Icc Constructor");
    }

    void tour(){
        System.out.println("Ind vs Nz");
    }
}

class  Bcci extends Icc{
    Bcci(){

        System.out.println("In Bcci Cons");
    }
    void tour(){
        super.tour();
        System.out.println("Ind vs Pak");
    }


}
