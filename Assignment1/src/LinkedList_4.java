import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_4 {
    public static void main(String[] args) {


        LinkedList<String> subs = new LinkedList<String>();

        subs.add("Turkey and Cheese");
        subs.add("Reuben");
        subs.add("Pulled Pork");
        subs.add("Italian");
        subs.add("Chicken Cheesesteak");

        Iterator s = subs.descendingIterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}