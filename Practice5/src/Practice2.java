class MultiThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Threading ");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        MultiThreadDemo2 threadDemo2 = new MultiThreadDemo2();
        Thread t1 = new Thread(threadDemo2);
        t1.start();
    }
}