package starting;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Start");
        System.out.println("Finish");
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();

    }
}
