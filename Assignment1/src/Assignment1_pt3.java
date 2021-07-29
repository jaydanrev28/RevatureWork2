import java.util.ArrayList;

public class Assignment1_pt3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");

        System.out.println(colors);

        ArrayList<String> newColors = new ArrayList<>();
        newColors.add("Yellow");
        newColors.add("Blue");
        colors.addAll(newColors);
        System.out.println(colors);
    }
}
