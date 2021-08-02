import java.io.File;

public class Practice17 {
    public static void main(String[] args) {

        File file = new File("yellow");
        System.out.println(file.exists());

        file.mkdir();

    }
}