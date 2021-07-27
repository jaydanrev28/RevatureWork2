class Calculator{
    public void addNumber(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void subNumber(int num1, int num2){
        System.out.println(num1 - num2);
    }
}
public class Practice3 {
    public static void main(String[] args) {
Calculator cal = new Calculator();
cal.addNumber(100,600);
Calculator.subNumber(100,50);
    }
}
