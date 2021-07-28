public class Practice8 {
    public static void main(String[] args) {
        String message = "Welcome to the Purple Rain listening party!";
        System.out.println(message.substring(0, 8));  // Welcome

        System.out.println("Original message: "+ message);
        System.out.println("Substring starting from index 7: "+ message.substring(7));
        System.out.println("Substring starting from index 0 to 7: "+ message.substring(0,7));

        String str = new String("Purple Rain");
        System.out.println(str);
        System.out.println(str.substring(7));

    }
}
