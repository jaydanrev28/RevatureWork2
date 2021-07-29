import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Raul");
        names.add("Yash");
        names.add("Siddharth");

        System.out.println(names.get(2));
        names.set(2, "Siddharth Ramadi");
        for (String name :names) {
            System.out.println(name);
        }
    }
}
