
class Calculator{
    int a = 150;
    int b = 150;
    public Calculator() {
        System.out.println("Parameter less constructor");
    }
    public Calculator(int x, int y){
        this.a = x;
        this.b = y;
    }
    public void addNumbers(){
        System.out.println(a +b);
    }

}

public class Practice20 {
    public static void main(String[] args) {
Calculator call = new Calculator();
call.addNumbers();
Calculator cal2 = new Calculator(1000,200);
 cal2.addNumbers();
    }
}
