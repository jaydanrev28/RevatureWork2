import java.util.TreeSet;

public class Practice12 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(656);
        set.add(2100);
        set.add(11456);
        set.add(223);
        set.add(198);

        for(int number: set){
            System.out.println(number);
        }

        // pollFirst()
        // PostLast()
        System.out.println("Highest: "+ set.pollLast());
        System.out.println("Lowest: "+ set.pollFirst());
    }
}
