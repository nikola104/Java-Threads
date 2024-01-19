package starting;

public class ThreadExample4 {
    public static void main(String[] args) {
        Thread myThread = new Thread(()->{
            System.out.println("I start be "+ Thread.currentThread().getName());
            System.out.println("I finsh be");
        }, "The thread");
        myThread.start();

    }
}
