package Employee;

import Bank.Bank;
import Bank.BankDAO;
import Bank.BankDAOFactory;
import Employee.Employee;
import User.User;
import User.UserDAO;
import User.UserDAOFactory;
import User.UserDAOImpl;
import User.Menu;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
//Refrenced from Manual Navarro
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Menu menus = new Menu();
        Employee employee = new Employee();
        int welcomeOtion = 0;
        Scanner scanner = new Scanner(System.in);

        while (welcomeOtion != 4) {
            int loggedInOption = 0;
            menus.mainMenu();
            welcomeOtion = scanner.nextInt();
            switch (welcomeOtion) {
                case 1:
                    menus.userAccountMenu();
                    break;
                case 2:
                    if (menus.userLogin()) {
                        while (loggedInOption != 3) {
                            scanner = new Scanner(System.in);
                            menus.UserLoggedInMenu();
                            loggedInOption  = scanner.nextInt();
                            switch (loggedInOption) {
                                case 1:
                                    menus.UserApplication();
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    System.out.println("\nLogging out...");
                                    break;
                                default:
                                    System.out.println("Invalid entry please try again");
                            }
                        }
                    }
                    break;
                case 3:
                    if (menus.employeeLogin()) {
                        while (loggedInOption != 6) {
                            scanner = new Scanner(System.in);
                            menus.empLoginMenu();
                            loggedInOption  = scanner.nextInt();
                            switch (loggedInOption) {
                                case 1:
                                    menus.accountApplicationsMenu();
                                    break;
                                case 2:
                                    menus.allCustomersMenu();
                                    break;
                                case 3:
                                    menus.customerAccountMenu();
                                    break;
                                case 4:
                                    menus.addEmployeeMenu();
                                    break;
                                case 5:
                                    ;
                                    break;
                                case 6:
                                    System.out.println("\nLogging out...");
                                    break;
                                default:
                                    System.out.println("Invalid entry please try again");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nThank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid entry.");
            }
        }

/*

        Scanner scan = new Scanner(System.in);
        //
        UserDAO udao = UserDAOFactory.getUserDao();
        BankDAO bdao = BankDAOFactory.getBankDao();
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();

        boolean uselection = true;
        while (uselection) {
            System.out.println("Please select an option:");
            System.out.println("1.Register Account");
            System.out.println("2.Login ");
            User acc = new User();
            int menusSelection = scan.nextInt();
        }
        boolean bselection = true;
        while (bselection) {
            System.out.println("Please select an option:");
            System.out.println("1. Deposit into Checkings");
            System.out.println("2. Deposit into Savings");
            System.out.println("3. Withdraw from Checkings.");
            System.out.println("4. Withdraw from Savings");
            System.out.println("5. Account Information");
            System.out.println("6. Quit");
            Bank account = new Bank();
            int menuSelection = scan.nextInt();
            switch (menuSelection) {
                case 1:
                    System.out.println("Enter Id: ");
                    String id = scan.next();

                    System.out.println("Enter First Name: ");
                    String firstname = scan.next();

                    System.out.println("Enter email:");
                    String lastname = scan.next();

                    System.out.println("Enter City:");
                    String username = scan.next();

                    System.out.println("Enter Password:");
                    String password = scan.next();

                    System.out.println("Enter pin");
                    int pin = scan.nextInt();
                    account.setFirstName(firstname);
                    account.setLastName(lastname);
                    account.setPassword(password);
                    account.setPin(pin);
                    bdao.startTransaction(account);
                    break;
                case 2:
                    System.out.println("Enter Password:");
                    String password2 = scan.next();

                    System.out.println("Enter pin:");
                    int pin2 = scan.nextInt();
                    account.setPin(pin2);
                    account.setPassword(password2);
                    bdao.depositCheckings(account);

                case 3:
                    System.out.println("Enter Password:");
                    String password3 = scan.next();

                    System.out.println("Enter pin:");
                    int pin3 = scan.nextInt();
                    account.setPin(pin3);
                    account.setPassword(password3);
                    bdao.depositSavings(account);
                case 4:
                    System.out.println("Enter pin:");
                    int pin4 = scan.nextInt();
                    account.setPin(pin4);
                    bdao.withdrawCheckings(pin4);
                case 5:
                    System.out.println("Enter pin:");
                    int pin5 = scan.nextInt();
                    account.setPin(pin5);
                    bdao.withdrawSavings(pin5);
                case 6:
                    System.out.println("Enter pin");
                    int pin6 = scan.nextInt();
                    account.setPin(pin6);
                    System.out.println("Enter Account Number");
                    int accountNumber = scan.nextInt();
                    account.setAccountNumber(accountNumber);
                    bdao.receiveAccount(account);
            }
        }

        boolean selection = true;
        while (selection) {
            System.out.println("Please select an option:");
            System.out.println("1. View User Account");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee.");
            System.out.println("4. Read Employee");
            System.out.println("5. Read Employee");
            System.out.println("6. Quit");
            Employee employee = new Employee();

            int menuSelection = scan.nextInt();
            switch (menuSelection) {

                case 1:
                    System.out.println("Enter Id: ");
                    String id = scan.next();
                    System.out.println("Enter First Name: ");
                    String firstname = scan.next();

                    System.out.println("Enter email:");
                    String lastname = scan.next();

                    System.out.println("Enter City:");
                    String username = scan.next();
                    System.out.println("Enter Password:");
                    String password = scan.next();
                    employee.setFirstname(firstname);
                    employee.setLastname(lastname);
                    employee.setPassword(password);
                    employee.setUsername(username);

                    dao.addEmployee(employee);

                    break;

                case 2:
                    //update
                    System.out.println("Enter Id: ");
                    int id2 = scan.nextInt();
                    System.out.println("Enter First Name: ");
                    String firstname2 = scan.next();

                    System.out.println("Enter Lastname:");
                    String lastname2 = scan.next();

                    System.out.println("Enter Username:");
                    String username2 = scan.next();
                    System.out.println("Enter Password:");
                    String password2 = scan.next();
                    employee.setFirstname(firstname2);
                    employee.setLastname(lastname2);
                    employee.setPassword(password2);
                    employee.setUsername(username2);
                    dao.updateEmployee(employee);

                    break;
                case 3:
                    System.out.println("Enter Id: ");
                    int delid = scan.nextInt();
                    dao.deleteEmployee(delid);

                    break;
                case 4:

                    dao.getEmployees(employee);

                    break;
                case 5:
                    System.out.println("Enter id number:");
                    int empId = scan.nextInt();
                    Employee employee1 = dao.employeeById(empId);
                    System.out.println(employee1);
                    break;
                case 6:
                    System.out.println("Thank you");
                    selection = false;
                    break;
                default:
                    System.out.println("Choose between options 1-6 please");
            }
            System.out.println();
        }
*/

    }
}