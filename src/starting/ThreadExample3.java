package starting;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("One");
                System.out.println("Ten");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
