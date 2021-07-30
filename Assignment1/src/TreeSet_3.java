import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("Green ");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Red");
        System.out.println(colors);
        TreeSet<String> ClothingBrands = new TreeSet<String>();
        ClothingBrands.add("Versace");
        ClothingBrands.add("Prada");
        ClothingBrands.add("Louis Vuitton");
        ClothingBrands.add( "Balenciaga");
        colors.addAll(ClothingBrands);
        System.out.println(colors);
    }
}
