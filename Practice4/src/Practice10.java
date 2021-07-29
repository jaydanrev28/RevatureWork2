import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Practice10 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Ten");
        set2.add("Twenty");
        set2.add("Thirty");
        set2.add("Forty");
        set2.add("Fifty");

        Iterator<String> iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
