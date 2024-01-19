package starting;

class ClassRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("I am starting");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I finished");

    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
            Thread thread = new Thread(new ClassRunnable());
            thread.setDaemon(true);
            thread.start();



        System.out.println("Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");


    }
}
