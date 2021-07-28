public class Practice25 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 20;
        a[1] = 40;
        a[2] = 60;

        try{
            System.out.println(a[70]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

    }
}
