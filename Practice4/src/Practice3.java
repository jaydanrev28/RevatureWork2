import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Teal");
        colors.add("Sky Blue");
        colors.add("Gold");
        colors.add("Fuscia");

        System.out.println("before sorting:");
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println("after sorting:");
        Collections.sort(colors);
        for (String color: colors) {
            System.out.println(color);
        }
            // List of numbers
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(56);
            numbers.add(96);
            numbers.add(250);
            numbers.add(456);

            // before sort
            System.out.println("before sorting...");
            for(int number: numbers){
                System.out.println(number);
            }

            // after sort
            Collections.sort(numbers);
            System.out.println("after sorting...");
            for(int number: numbers){
                System.out.println(number);
        }
    }
}
