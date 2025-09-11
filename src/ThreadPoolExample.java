// File: ThreadPoolExample.java
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
       // ExecutorService pool = Executors.newFixedThreadPool(3);

        // pool of 3 threads
ExecutorService pool = Executors.newFixedThreadPool(5);

for (int i =1;i<=5;i++){
    final  int id =1;

    pool.submit(()->
    {
        String tname = Thread.currentThread().getName();

        System.out.println("Task " + id + tname);
    }  );
            }
}

    }

