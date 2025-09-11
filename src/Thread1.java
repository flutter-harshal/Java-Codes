public class Thread1
{
    public static void main(String[] args) throws InterruptedException {
        MyThread6 obj = new MyThread6();
        obj.start();
        for (int i =0;i<10;i++){
            System.out.println("In main");
            Thread.sleep(1000);
        }

    }
}

class MyThread6 extends  Thread {
public  void  run(){
    for(int i=0;i<10;i++){
        System.out.println("In run");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            System.out.println();
        }
    }
}
}
