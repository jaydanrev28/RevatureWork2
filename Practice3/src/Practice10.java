import java.util.Arrays;
public class Practice10 {
    public static void main(String[] args) {
        String message = "Hello, Welcome to the Purple Rain listening party!!!";
        String[] result = message.split("\\,");
        System.out.println(Arrays.toString(result));
    }
}
