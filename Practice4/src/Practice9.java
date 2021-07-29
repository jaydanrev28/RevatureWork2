import java.util.HashSet;
import java.util.Iterator;

public class Practice9 {
    public static void main(String[] args) {
        // create HashSet and add elements
        HashSet<String> set = new HashSet<>();
        set.add("Amy");
        set.add("Anna");
        set.add("Clark");
        set.add("Danny");
        set.add(null);
        set.add(null);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // remove()
        set.remove("Clark");
        System.out.println(set);

        // removeAll()
        // removeIf()
        // clear()

    }

}
