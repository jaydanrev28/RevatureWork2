import java.util.ArrayList;
import java.util.Collections;

public class Assignment1_pt4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");
        int color1 = colors.indexOf("Red");
        System.out.println(color1);

        Collections.replaceAll(colors,"Black","Pink");
        System.out.println(colors);


    }
}