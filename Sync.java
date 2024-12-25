
public class Sync {

    public synchronized void classRoom() {
        for (int i = 0; i < 5; i++) {

            System.out.println("This class is taught by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        Sync c = new Sync();
        Thread ram = new Thread("ram") {
            @Override
            public void run() {
                c.classRoom();
            }
        };
        Thread shyam = new Thread("shyam") {
            @Override
            public void run() {
                c.classRoom();
            }
        };
        ram.start();
        shyam.start();
    }
}
