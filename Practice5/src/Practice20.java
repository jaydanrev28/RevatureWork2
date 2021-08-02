import java.io.File;


import javax.swing.plaf.IconUIResource;
        import java.io.File;

public class Practice20 {
    public static void main(String[] args) {
        int count = 0;

        File file = new File("yellow");

        String[] list = file.list();

        for (String s : list) {
            File f = new File(file, s);
            if (f.isFile()) {
                count++;
                System.out.println(s);
            }
        }
    }
}