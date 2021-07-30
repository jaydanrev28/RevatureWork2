import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {
    public static void main(String[] args) {
     HashSet<String> ClothingBrands = new HashSet<String>();

        ClothingBrands.add("Versace");
        ClothingBrands.add("Prada");
        ClothingBrands.add("Louis Vuitton");
        ClothingBrands.add( "Balenciaga");
        ClothingBrands.add("Vetements");
        ClothingBrands.add( "Monclair");


        Iterator<String> p = ClothingBrands.iterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
    }

