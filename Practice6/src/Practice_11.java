interface MultipleStatement {
    String print(String message);
}

public class Practice_11 {
    public static void main(String[] args) {
        MultipleStatement multipleStatement = (message) -> {
            String str1 = "Statement 1, ";
            String str2 = "Statement 2, ";
            String str3 = "Statement 3";
            return str1 + str2 + str3;
        };

        System.out.println(multipleStatement.print("Hello"));
    }
}
