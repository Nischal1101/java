
class Bahira {

    static class Vitra {

        static void printGreeting() {
            System.out.println("hello from vira");
        }
    }

    void getVitra() {
        Vitra.printGreeting();

    }
}

public class InnerClass {

    public static void main(String[] args) {
        Bahira b = new Bahira();
        b.getVitra();
    }

}
