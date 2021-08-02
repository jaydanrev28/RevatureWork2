
import java.io.FileWriter;
import java.io.IOException;

public class Practice22 {
    public static void main(String[] args) throws IOException {
        // it will first check do we have a file by this name
        // or it will create a new file
        FileWriter fw = new FileWriter("data.txt", true);
        fw.write(10);
        fw.write(100);  // single character
        fw.write("What are you doing??????");
        fw.write("\n");;
        char[] c1 = { 'a', 'b', 'c' };
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}