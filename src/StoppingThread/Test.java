package StoppingThread;

public class Test {
    public static void main(String[] args) {
        CustomThread th1 = new CustomThread();
        Thread t1 = new Thread(th1);
        t1.start();
        th1.stop = true;
    }
}
