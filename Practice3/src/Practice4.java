public class Practice4 {
    public static void main(String[] args) {
        String s1 = "Adam";
        String s2 ="Adam";
        String s3 = new String("Adam");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
    }
}
