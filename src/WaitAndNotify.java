public class WaitAndNotify {

    public static void main(String[] args) {

        SharedBuffer buffer=new SharedBuffer();

        Thread thread = new Thread(()-> {
            for (int i = 1; i <= 5; i++) {
                buffer.producer(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        });



        Thread cosumer = new Thread(()->{
            for (int i=1;i<=5;i++){
                buffer.consumer();
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        );

        thread.start();
        cosumer.start();

    }
}

class SharedBuffer {
    private  int data;
    private  boolean hasData= false;

    public  synchronized  void producer(int values){
        while (hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        data=values;
        hasData=true;
        System.out.println("Produce :" + values);
        notify();
    }

    public  synchronized  void  consumer(){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed :" + data);
        hasData=false;
        notify();
    }
}
