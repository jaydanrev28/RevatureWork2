class Book {
    public String title;
    public String author;
    public int price;
}
public class Practice2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title ="Java";
        book1.author ="Jaydan";
        book1.price = 265 ;
        System.out.println("Book: " + book1.title + " ,Author: " + book1.author + " ,Price: " + book1.price);

        Book book2 = new Book();
        book2.title = "Angular";
        book2.author = "Jacobs";
        book2.price  = 2000;
        System.out.println("Book: " + book2.title + " ,Author: " + book2.author + " ,Price: " + book2.price);

    }
}
