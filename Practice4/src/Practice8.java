import java.util.Iterator;
import java.util.LinkedList;
public class Practice8 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Malcom");
        names.add("Richard");
        names.add("Annabelle");
        System.out.println(names);

        // adding element at specified position
        names.add(0, "Yosahn");
        System.out.println(names);

        // adding second list
        LinkedList<String> namesNew = new LinkedList<>();
        namesNew.add("Rick");
        namesNew.add("Morty");

        //names.addAll(namesNew);
        //System.out.println(names);

        names.addAll(0, namesNew);
        System.out.println(names);

        // addFirst()
        names.addFirst("First");
        System.out.println(names);


        // addLast()
        names.addLast("Last");
        System.out.println(names);

        // remove()
        // remoteFirst()
        // removeLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()

        names.add("Beth");
        names.add("Jerry");
        System.out.println(names);

        //names.removeFirstOccurrence("John");
        names.removeLastOccurrence("Annabelle");
        System.out.println(names);

        // reverse elements
        System.out.println("original");
        System.out.println(names);

        // traversing list element in reverse order
        Iterator iterator = names.descendingIterator();
        while(iterator.hasNext()){
            //SSystem.out.println(iterator.next());
        }

        for(int i=names.size() -1; i>0;i--){
            //System.out.println(names.get(i));
        }

    }
}
