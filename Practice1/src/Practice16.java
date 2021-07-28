

    class Book2 {
    private String title;
    private String author;
    private int price;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getAuthor() {

            return author;
        }

        public void setAuthor(String author) {

            this.author = author;
        }
        public void printInfo(){
            System.out.println("Book: " + title + " ,Author: " + author + " ,Price: " + price);
        }
    }

    public class Practice16 {
    public static void main(String[] args) {
        Book2 bookObj = new Book2();
        bookObj.setTitle("Sql");
        bookObj.setAuthor("Jaydan");
        bookObj.setPrice(200);

        bookObj.printInfo();

    }
}
