class Employee{

    String name;

    public <T> Employee(T name){
        this.name = name.toString();
    }

}

public class Practice_6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jamie");
        Employee emp2 = new Employee(1583);

        System.out.println((emp1.name) +"\n" + emp2.name);
    }
}
