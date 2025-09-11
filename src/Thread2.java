public class Thread2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread1 obj = new MyThread1();
        obj.start();
        Demo5 obj1 = new Demo5();
        obj1.start();

    }
}

class  MyThread1 extends Thread{
    public  void run(){
        System.out.println("MyThread1 :" + Thread.currentThread().getName());
    }
}

class  Demo5 extends Thread{
    public  void run(){
        System.out.println("Demo5 :" + Thread.currentThread().getName());
    }
}

