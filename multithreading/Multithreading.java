package multithreading;

public class Multithreading extends Thread {

    @Override
    public void run() {
        print();
    }

    static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello from " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        Multithreading t2 = new Multithreading();
        t1.start();
        t2.start();
        Multithreading.print();
    }

}
