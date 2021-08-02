import java.io.File;

public class Practice21 {
    public static void main(String[] args) {
        File file = new File("yellow", "first.txt");
        file.delete();

        System.out.println(file.exists());
    }
}
