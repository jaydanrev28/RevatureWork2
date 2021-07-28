public class Practicce3 {
    public static void main(String[] args) {

        String s1 = "Adam";
        String s2 = "Louis";
        String s3 = new String("Adam");
        String s4 = "Jamie";

        System.out.println(s1.equals(s2));//FALSE
        System.out.println(s1.equals(s3));//TRUE
        System.out.println(s1.equals(s4));//FALSE

        String s5 ="ADAM";
        System.out.println(s1.equals(s5));//FALSE
        System.out.println(s1.equalsIgnoreCase(s5));//TRUE

    }
}
