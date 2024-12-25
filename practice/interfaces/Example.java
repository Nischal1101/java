package interfaces;

interface Okay {

    public void getGreetings();
}

public class Example implements Okay {

    @Override
    public void getGreetings() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.getGreetings();
    }
}
