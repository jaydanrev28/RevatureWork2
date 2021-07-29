import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Practice15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "kent");
        map.put("roll", 50000);
        map.put("email", "kent@gmail.com");
        map.put("active", false);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            // converting to map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }


    }
}
