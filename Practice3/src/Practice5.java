public class Practice5 {
    public static void main(String[] args) {
        String s1 = "Adam";
        String s2 = "Louis";
        String s3 = "Jamie";

        System.out.println(s1.compareTo(s2)); // -
        System.out.println(s1.compareTo(s3));  // -
        System.out.println(s3.compareTo(s1));  // +
    }
}
