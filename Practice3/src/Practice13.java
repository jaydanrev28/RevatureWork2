public class Practice13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Purple");
        System.out.println(sb.capacity());
        sb.append("Welcome to the Purple Rain listening party, have a great time!");
        System.out.println(sb.capacity());

    }
}
