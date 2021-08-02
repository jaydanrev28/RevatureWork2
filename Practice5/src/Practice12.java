class Table3{
    public  void prinTable(int number){
        synchronized (this){
            for(int i=0;i<10;i++){
                System.out.println(number * i);;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Practice12 {
    public static void main(String[] args) {
        Table3 table = new Table3();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                table.prinTable(8);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                table.prinTable(64);
            }
        };

        t1.start();
        t2.start();
    }
}

