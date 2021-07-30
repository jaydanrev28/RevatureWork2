import java.util.LinkedList;

public class LinkedList_2 {
    public static void main(String[] args) {


        LinkedList<String> foods = new LinkedList<>();


        foods.add("Japanese");
        foods.add("Spanish");
        foods.add("Italian");
        foods.add("Bengali");


        iterateUsingForLoop(foods);
    }

    public static void
    iterateUsingForLoop(LinkedList<String> foods) {


        for (int i = 0; i < foods.size(); i++) {
            System.out.print(foods.get(i) + " ");
        }
    }
}
