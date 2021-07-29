import java.util.Iterator;
import java.util.LinkedList;
public class Practice7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Yoda");
        names.add("Mace Windu");
        names.add("Han Solo");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
