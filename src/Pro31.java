public class Pro31 {
    public static void main(String[] args) {
        Demo demo =new Demo();
        demo.fun("Harsh");
        demo.fun(new StringBuffer("C2w"));
        demo.fun(null);

    }
}

class  Demo{
    Demo(){
        System.out.println("In Demo constructor");
    }

    void fun(Object obj){
        System.out.println(obj);

    }

    void fun(String str){
        System.out.println(str);



}
}