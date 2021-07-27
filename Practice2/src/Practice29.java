class Company{
    public void test1(){
        System.out.println("test1");
    }
    private void test2(){
        System.out.println("test2");
    }
    protected void test3(){
        System.out.println("test3");
    }
    void test4(){
        System.out.println("test4");
    }
    class Subcompany extends Company{
        public void test5(){

        }
    }
}
public class Practice29 {
    public static void main(String[] args) {
        Company company = new Company();
        company.test1();
        company.test3();
        company.test4();
    }
}
