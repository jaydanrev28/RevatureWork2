import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
