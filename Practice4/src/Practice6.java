import java.util.ArrayList;

public class Practice6 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Raul");
        names.add("Liam");
        names.add("Sherlock");
        System.out.println(names);

        // getting element on a specified index
        System.out.println(names.get(3));

        // adding the element on a specific index
        names.add(1, "Jamie");
        System.out.println(names);

        // merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Anakin");
        newNames.add("Obi Wan");
        //names.addAll(newNames);

        // adding second list element to the specified position
        names.addAll(0, newNames);

        System.out.println(names);

        // remove
        //names.remove("Mark");
        System.out.println(names);

        // remote
        //names.remove(0);
        System.out.println(names);

        names.removeAll(newNames);
        System.out.println(names);

        // removing an element based on condition
        names.removeIf(name -> name.contains("Liam"));
        System.out.println(names);

    }
}
