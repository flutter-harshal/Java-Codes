public class Thred3 {
    public static void main(String[] args) {
        MyThread3 obj = new MyThread3();
        Thread t = new Thread(obj);
        t.start();
    }
}

class  MyThread3 implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}