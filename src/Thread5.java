public class Thread5 {
    public static void main(String[] args) {
        Mythread obj = new Mythread("Harsh");
        obj.start();

    }
}

class  Mythread extends  Thread{

    Mythread(String str){
        super(str);
//        System.out.println(Thread.currentThread().getName());


    }

    public  void run(){
        System.out.println(getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}