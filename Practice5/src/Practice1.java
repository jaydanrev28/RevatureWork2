class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Threading");
    }
}



public class Practice1 {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.start();
    }
}
