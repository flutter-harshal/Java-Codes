public class Thread6 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("Harshal");
        Mythread2 obj = new Mythread2(threadGroup,"c");
        Thread.sleep(1000);
        Mythread2 obj1= new Mythread2(threadGroup,"Java");
        Thread.sleep(1000);
        Mythread2 obj2= new Mythread2(threadGroup,"Python");
        Thread.sleep(1000);
        obj.start();
        obj1.start();
        obj2.start();

    }
}
class Mythread2 extends Thread{

    Mythread2
            (ThreadGroup threadGroup, String string){
        super();
//        System.out.println(threadGroup);
//        System.out.println(string);
    }

    public  void  run(){
    System.out.println(Thread.currentThread());
    }
}