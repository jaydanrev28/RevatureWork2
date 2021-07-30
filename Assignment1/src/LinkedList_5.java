import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> foods = new LinkedList<>();


        foods.add("Japanese");
        foods.add("Spanish");
        foods.add("Italian");
        foods.add("Bengali");
        System.out.println(foods);
        foods.add(2, "Caribbean");
        System.out.println(foods);
    }
}
