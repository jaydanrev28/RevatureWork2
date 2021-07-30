import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");
        System.out.println(colors);
        Iterator color = colors.descendingIterator();
        while (color.hasNext()) {
            System.out.println(color.next());
        }
    }
}