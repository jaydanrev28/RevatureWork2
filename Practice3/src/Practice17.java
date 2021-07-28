public class Practice17 {
    public static void main(String[] args) {

        int a = 40;
        int b = 0;
        int c= 150;
        try{
            c = a / b;
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){

        }


        System.out.println(c);

    }
}
