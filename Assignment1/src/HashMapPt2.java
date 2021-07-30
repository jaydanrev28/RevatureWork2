import java.util.HashMap;

public class HashMapPt2 {
    public static void main(String[] args) {


        HashMap<Integer, String> Cars = new HashMap<Integer, String>();
        Cars.put(1, "Red");
        Cars.put(2, "Green");
        Cars.put(3, "Black");
        Cars.put(4, "White");
        Cars.put(5, "Blue");
        System.out.println("Hash Map size "+Cars.size());

    }
}