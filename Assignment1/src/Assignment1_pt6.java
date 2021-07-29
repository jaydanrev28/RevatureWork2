import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment1_pt6 {
    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");

        Collections.swap(colors,3,5);
        System.out.println(colors);

        System.out.println("Original list: " + colors);
        List<String> sub_List =  colors.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);

        Collections.reverse(colors);
        System.out.println(colors);

    }
}
