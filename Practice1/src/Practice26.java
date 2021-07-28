class T{
    public void test1(){
        System.out.println("T");
    }
}

class U extends T{
    public void test2(){
        System.out.println("U");
    }
}

class V extends T{
    public void test3(){
        System.out.println("V");
    }
}
public class Practice26 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test1();

        U u1 = new U();
        u1.test1();
        u1.test2();

        V v1 = new V();
        v1.test1();
        v1.test3();
    }
}
