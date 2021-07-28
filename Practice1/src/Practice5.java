public class Practice5 {
    public static void main(String[] args) {

        int score = 300;

        if(score >= 20)
            System.out.println("A Grade");
        else if(score < 100 && score > 80)
            System.out.println("B Grade");
        else if(score < 76 && score > 49)
            System.out.println("C grade");
        else
            System.out.println("D grade");

    }
}
