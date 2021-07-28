class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String middleInitial;
    public String email;

    public void fullName(){
        System.out.println(firstName +" "+ middleInitial +" "+ lastName);
    }
}
class FullTimeEmployee extends Employee{
    public int annualSalary;
    public void fullTimeEmployeePortfolio(){
        System.out.println(firstName+" "+ middleInitial+ " " + lastName + " " +"Annual Salary: " + annualSalary);
    }
}
class PartTimeEmployee extends Employee{
    public int hourlySalary;
    public void partTimeEmployeePortfolio(){
        System.out.println(firstName+" "+ middleInitial+ " " + lastName + " " +"Hourly Salary: " + hourlySalary);
    }
    }
public class Practice22 {
    public static void main(String[] args) {
    FullTimeEmployee fte = new FullTimeEmployee();
    fte.firstName = "Mark";
    fte.lastName = "Johnson";
    fte.middleInitial = "P";
    fte.annualSalary = 100000;

    PartTimeEmployee pte = new PartTimeEmployee();
    pte.firstName = "Paige";
    pte.lastName = "Musselman";
    pte.middleInitial = "M";
    pte.hourlySalary = 60;

    pte.partTimeEmployeePortfolio();
    fte.fullTimeEmployeePortfolio();
    }
}
