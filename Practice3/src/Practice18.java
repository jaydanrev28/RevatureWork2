public class Practice18 {
    public static void main(String[] args) {

        int a  = 230;
        int b = 10;
        int c = 380;

        try{
            b = c / a;
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){

        }


        System.out.println(c);



    }
}
