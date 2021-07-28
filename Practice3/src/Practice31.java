

import java.io.FileOutputStream;
public class Practice31 {
    public static void main(String[] args) {


            try (FileOutputStream stream = new FileOutputStream("C:\\data.txt"))//Access is denied
            {

                String data = "Purple Rain";
                byte[] arr = data.getBytes();
                stream.write(arr);
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Resource is closed");


        }
    }

