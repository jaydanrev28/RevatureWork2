import java.util.HashMap;

public class HashMapPt3 {
    public static void main(String[] args) {
        HashMap <Integer,String> ClothingBrands = new HashMap <Integer,String> ();
        HashMap<Integer,String> ClothingBrands2 = new HashMap <Integer,String> ();

        ClothingBrands.put(1, "Versace");
        ClothingBrands.put(2, "Prada");
        ClothingBrands.put(3, "Louis Vuitton");
        System.out.println("\n Values in map 1: " + ClothingBrands);
        ClothingBrands2.put(4, "Balenciaga");
        ClothingBrands2.put(5, "Vetements");
        ClothingBrands2.put(6, "Monclair");
        System.out.println("\n Values in map 2: " + ClothingBrands2);



        ClothingBrands2.putAll(ClothingBrands);
        System.out.println("\n New values in map 2: " + ClothingBrands2);
    }
    }

