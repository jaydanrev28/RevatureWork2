import java.util.ArrayList;
import java.util.Collections;

public class Assignment1_pt5 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");
        Collections.shuffle(colors);
        System.out.println(colors);

    }
}