public class LambdaPro {
    public static void main(String[] args) {
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Running without lambda");
            }
        };

        Runnable runnable1= ()-> System.out.println("Running with lambda");

        new Thread(runnable).start();
        new  Thread(runnable1).start();
    }
}
