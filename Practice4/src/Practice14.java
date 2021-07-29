import java.util.ArrayDeque;
import java.util.Deque;

public class Practice14 {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Anna");
        deque.add("Larry");
        deque.add("Kent");

        for(String name: deque){
            System.out.println(name);
        }

    }
}
