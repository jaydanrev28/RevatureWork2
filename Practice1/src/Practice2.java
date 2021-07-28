public class Practice2 {
    public static void main(String[] args) {

        int a = 50;
        int b = 60;
        int c = 400;
        boolean e = true;
        boolean f = false;

        System.out.println(a + b);
        System.out.println(a -b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out.println(a>b && a>c);

        System.out.println(a > b || a < c);

        int max = (a < b)? a: b;
        System.out.println(max);

    }
}
