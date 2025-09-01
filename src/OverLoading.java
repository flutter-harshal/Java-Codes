public class OverLoading {
    public static void main(String[] args) {

        Mathoperator op =new Mathoperator();
        System.out.println(op.sum(10,20));
        System.out.println(op.sum(12.34,45.87));


    }
}

class Mathoperator{
    int sum(int a, int b){
        return a+b;
    }

    double sum(double a , double b){
        return a+b;
    }


}
