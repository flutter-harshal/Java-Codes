public class Thread4 {
    public static void main(String[] args) {
        Mythread6 obj = new Mythread6();

        Thread T= Thread.currentThread();
        System.out.println(T.getPriority());

        obj.start();

    }
}

class  Mythread6 extends  Thread{
    public  void  run(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}
