
       import java.io.File;
import java.io.IOException;

public class Practice18 {
    public static void main(String[] args) {

        File dir = new File("yellow");
        dir.mkdir();

        File file = new File("yellow", "green.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}