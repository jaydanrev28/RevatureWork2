import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {

        LinkedList<String> books = new LinkedList<String>();

        books.add("Sherlock Holmes");
        books.add("Nancy Drew");
        books.add("The Lightning Thief");
        books.add("Sea of Monsters");
        books.add("The Alchemist");
        books.add("Ghost in a Shell");


        System.out.println("Linked List: " + "\n" + books);
    }
}
