import com.sun.applet2.AppletParameters;

import java.util.HashMap;
import java.util.Map;

public class HashMapPt1 {
    public static void main(String args[]) {
        HashMap<Integer,String> Cars = new HashMap<Integer,String>();
        Cars.put(1,"AstonMartin" );
        Cars.put(2, "Bugatti");
        Cars.put(3, "Lamborghini");
        Cars.put(4, "Koeinsegg");
        Cars.put(5, "Citrogen");
        for(Map.Entry x:Cars.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
