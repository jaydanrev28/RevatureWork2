import java.util.ArrayList;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<String>();

        sList.add("Adam");
        sList.add("Michael");
        sList.add("Jamie");
        sList.add("Jamal");

        Iterator iterator = sList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //break;
        }
        for (String name: sList) {
            System.out.println(name);

        }
    }
}
