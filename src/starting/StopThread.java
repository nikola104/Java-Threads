package starting;
class StopRunnable implements Runnable{
    boolean isStopped = false;

    public synchronized void stopTheThread(){
        this.isStopped = true;
    }

    private void sleepCurrentThread(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is starting");
        while(!isStopped){
            System.out.println("In process ....");
            sleepCurrentThread(1000);
        }
        System.out.println(Thread.currentThread().getName()+" end");
    }
}
public class StopThread {
    public static void main(String[] args) {
        StopRunnable stopRunnable = new StopRunnable();
        Thread myThread = new Thread(stopRunnable,"StopRunnable");
        myThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stop Request...");
        stopRunnable.stopTheThread();
        System.out.println("The Thread is stopped");


    }
}
