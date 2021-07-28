
class Book3 {
    private String title;
    private String author;
    private int price;

    public Book3(String title, String author, int price){
        this.author = author;
        this.title = title;
        this. price = price;


    }
public void printInfo(){
    System.out.println("Book: " + title + " ,Author: " + author + " ,Price: " + price);
}

}
public class Practice17 {
    public static void main(String[] args) {
Book3 myObj = new Book3("Angular","Jaydan", 500);
myObj.printInfo();
    }
}
