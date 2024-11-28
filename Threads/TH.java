package Threads;

public class TH {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("1");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("2");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }                
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
