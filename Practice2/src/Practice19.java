interface IEmployee{
    void print();
}
class Employee2 implements IEmployee{
    @Override
    public void print() {
        System.out.println("Interface print method");
    }
}
public class Practice19 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        emp.print();
    }
}
