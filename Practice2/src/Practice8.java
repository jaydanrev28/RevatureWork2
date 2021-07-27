class Calculation{
    public void test(){
        System.out.println("first method");
    }
    public void test (String a){
        System.out.println("second method");
    }
    public void test(int a ) {
        System.out.println("third method");
    }
    public void test(int a, String b){
        System.out.println("fourth method");
    }
    public void test(String a, int b){
        System.out.println("fifth method");
    }
}
public class Practice8 {
    public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.test();
    cal.test(10);
    cal.test("A");
    cal.test(10, "A");
    cal.test("A",10);
    }
}
