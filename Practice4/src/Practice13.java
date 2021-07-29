import java.util.PriorityQueue;

public class Practice13 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("John");
        queue.add("Clark");
        queue.add("Andy");
        queue.add("James");

        for(String name: queue){
            System.out.println(name);
        }

        System.out.println("head:"+ queue.element());
        System.out.println("head:"+ queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());


        System.out.println("*****************");
        for(String name: queue){
            System.out.println(name);
        }
    }
}
