import java.util.Hashtable;
import java.util.Map;

public class Practice17 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Andre");
        hashtable.put(2, "Pablo");
        hashtable.put(3, "Eric");
        hashtable.put(4, "Zach");

        for(Map.Entry entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
