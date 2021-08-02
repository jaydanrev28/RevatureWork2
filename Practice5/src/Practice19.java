
import java.io.File;

public class Practice19 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("yellow");
        String[] list = file.list();
        for(String s: list){
            count++;
            System.out.println(s);
        }

        System.out.println("Total number of file and folder = "+ count);
    }
}
