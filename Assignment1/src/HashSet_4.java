import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<String>();
        books.add("Sherlock Holmes");
        books.add("Nancy Drew");
        books.add("The Lightning Thief");
        books.add("Sea of Monsters");
        books.add("The Alchemist");
        books.add("Ghost in a Shell");
        books.removeAll(books);
        System.out.println(books);
    }
}
