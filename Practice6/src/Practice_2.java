import java.util.ArrayList;
import java.util.Collections;

public class Practice_2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Beach");
        words.add("Ocean");
        words.add("Water");
        words.add("Car");
        words.add("Road");

        System.out.println("before sorting...");
        for(String word: words){
            System.out.println(word);
        }
        Collections.sort(words);
        System.out.println("after sorting...");
        for(String letter: words){
            System.out.println(letter);
        }

    }
}