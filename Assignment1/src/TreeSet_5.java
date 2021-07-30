import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        TreeSet<String> ClothingBrands = new TreeSet<String>();
        ClothingBrands.add("Versace");
        ClothingBrands.add("Prada");
        ClothingBrands.add("Louis Vuitton");
        ClothingBrands.add( "Balenciaga");
        System.out.println(ClothingBrands);
        Object element1 = ClothingBrands.first();
        Object element2 = ClothingBrands.last();
        System.out.println(ClothingBrands.first());
        System.out.println(ClothingBrands.last());
    }
}
