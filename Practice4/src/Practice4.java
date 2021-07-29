

import java.util.ArrayList;
import java.util.ListIterator;
public class Practice4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siddhartha");
        names.add("Darshan");
        names.add("Sakshi");
        names.add("Roshni");

        //System.out.println(names.size());
        // for
        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }


        // forEach
        names.forEach(name -> {
            System.out.println(name);
        });
    }
}
