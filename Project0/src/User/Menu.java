package User;

import Applications.Applications;
import Applications.ApplicationDAO;
import Applications.ApplicationsDAOFactory;
import Bank.Bank;
import Bank.BankDAO;
import Employee.Employee;
import User.UserDAO;
import User.User;
import Bank.BankDAOFactory;
import Employee.EmployeeDAO;
import Employee.EmployeeDAOFactory;
import User.UserDAOFactory;
import User.UserDAOImpl;
import Account.Account;
import Account.AccountDAO;
import Account.AccountDAOFactory;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Bank account = new Bank();
    Applications application = new Applications();
    User acc = new User();
    Account accounts = new Account();
    Employee employee = new Employee();
    ApplicationDAO adao = ApplicationsDAOFactory.getApplicationsDAO();
    BankDAO bdao = BankDAOFactory.getBankDao();
    EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
    UserDAO udao = UserDAOFactory.getUserDao();
    AccountDAO aadao = AccountDAOFactory.getAccountDao();
    public void mainMenu() {
        System.out.println("\n*************************************");
        System.out.println("* Welcome to Jaydan's Banking App !!!*");
        System.out.println("*************************************");
        System.out.println("Please select an option!");
        System.out.println("\n1 - Employee Login");
        System.out.println("2 - Customer Login");
        System.out.println("3 - Create Customer Account");
        System.out.println("4 - Exit");
    }

    public void userAccountMenu() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create your account!!!!\n");
        System.out.println("Enter your first name");
        User.setUser_firstname(scan.next());
        System.out.println("Enter your last name");
        User.setUser_lastname(scan.next());
        System.out.println("Enter a username");
        User.setUser_username(scan.next());
        System.out.println("Enter a password");
        User.setUser_password(scan.next());
        udao.registerUser(acc);
    }
    public boolean userLogin() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int attempt = 0;

        System.out.println("* Customer Login!!! \n");
        System.out.println("******************");
        System.out.println("Enter Username");
        String user_username = scan.next();
        System.out.println("Enter password");
        String user_password = scan.next();
        while (udao.loginUser(user_username,user_password) == false && attempt < 3) {
            System.out.println("\nInvalid Login!");
            System.out.println("\nEnter Username");
           user_username  = scan.next();
            System.out.println("Enter password");
            user_password = scan.next();
            attempt++;
        }
        if (attempt == 3) {
            System.out.println("\nToo many attempts.");
            return false;
        }
        else
            new User(udao.currentUser(user_username,user_password));
        return true;
    }
    public boolean employeeLogin() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        System.out.println("\n******************");
        System.out.println("* Employee Login *");
        System.out.println("******************");
        System.out.println("Enter Email:");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        while (dao.verifyLogin(email, password) == false && attempts < 3) {
            System.out.println("\nInvalid Login!");
            System.out.println("\nEnter Email");
            email = scanner.next();
            System.out.println("Enter password");
            password = scanner.next();
            attempts++;
        }
        if (attempts == 3) {
            System.out.println("\nToo many attempts.");
            return false;
        }
        else
            return true;
    }
    public void UserLoggedInMenu() {
        System.out.println("\n**********************");
        System.out.println("* Logged in! *");
        System.out.println("**********************");
        System.out.println("Please select an option!");
        System.out.println("\n1 - Apply for a New Bank Account");
        System.out.println("2 - Select Bank Account");
        System.out.println("3 - Exit");
    }
    public void UserApplication() throws SQLException {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (option != 3) {
            System.out.println("\n*************************");
            System.out.println("* Apply for New Bank Account ! *");
            System.out.println("*************************");
            System.out.println("Please select an option!");
            System.out.println("\n1 - Apply for a Checking Account");
            System.out.println("2 - Apply for a Savings Account");
            System.out.println("3 - Exit");
            option = scanner.nextInt();
            int balanceOption;
            switch (option) {
                case 1:
                    application.setAccountType("Checking");
                    System.out.println("\nPlease choose a Starting Balance");
                    System.out.println("1 - $200");
                    System.out.println("2 - $5000");
                    System.out.println("3 - $50000");
                    Scanner scanner1 = new Scanner(System.in);
                    balanceOption = scanner1.nextInt();
                    applicationSet(balanceOption);
                    break;
                case 2:
                    application.setAccountType("Saving");
                    System.out.println("\nSelect a Starting Balance!");
                    System.out.println("1 - Starting balance $100");
                    System.out.println("2 - Starting balance $1000");
                    System.out.println("3 - Starting balance $10000");
                    Scanner scanner2 = new Scanner(System.in);
                    balanceOption = scanner2.nextInt();
                    applicationSet(balanceOption);
                    break;
                case 3:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("Invalid entry");
            }

        }
    }
    private void applicationSet(int option) throws SQLException {
        User user1 = User.getCurrentUser();
        switch (option) {
            case 1:
                application.setId(application.getId());
                application.setFirstname(application.getFirstname());
                application.setLastname(application.getLastname());
                application.setCheckingBalance(100);
                application.setSavingBalance(200);
                adao.userApplication(application);
                break;
            case 2:
                application.setId(application.getId());
                application.setFirstname(application.getFirstname());
                application.setLastname(application.getLastname());
                application.setCheckingBalance(500);
                application.setSavingBalance(1000);
                adao.userApplication(application);
                break;
            case 3:
                application.setId(application.getId());
                application.setFirstname(application.getFirstname());
                application.setLastname(application.getLastname());
                application.setCheckingBalance(10000);
                application.setSavingBalance(20000);
                adao.userApplication(application);
                break;
            default:
                System.out.println("\nInvalid entry");
        }
    }
    public void empLoginMenu() {
        System.out.println("\n**********************");
        System.out.println("* Employee Logged In *");
        System.out.println("**********************");
        System.out.println("Please select an option!");
        System.out.println("\n1 - View Account Applications");
        System.out.println("2 - View All Customers");
        System.out.println("3 - View Customer's Accounts By Id");
        System.out.println("4 - Add a New Employee");
        System.out.println("5 - View All Logs");
        System.out.println("6 - Exit");
    }

    public void accountApplicationsMenu() throws SQLException {
        Applications applications1 = new Applications(application.getAccountNumber());
        System.out.println("\n************************");
        System.out.println("* Pending Applications *");
        System.out.println("************************");
        List<Applications> applications = adao.getApplication();
        if (applications.isEmpty()){
            System.out.println("\nThere are no current applications.");
        }else {
            System.out.println("Please select an application by Id!");
            for (Applications application : applications) {
                //System.out.println(application);
                System.out.println("\nApplicationId: " + application.getId() + "\nCustomerId: " + application.getId() +
                        "\nCustomer Name: " + application.getFirstname() + " " + application.getLastname() +
                        "\nChecking Balance Request: "+applications1.getCheckingBalance()+"\nSavings Balance Request: "+applications1.getSavingBalance());
            }
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            applications1 = adao.getApplicationById(id);
            System.out.println("\n**************************************************************");
            System.out.println("\nApplicationId: "+applications1.getId()+"\nCustomerId: "+applications1.getId()+
                    "\nCustomer Name: "+applications1.getFirstname()+" "+applications1.getLastname()+
                    "\nChecking Balance Request: "+applications1.getCheckingBalance()+"\nSavings Balance Request: "+applications1.getSavingBalance());
            System.out.println("\nPlease select an option");
            System.out.println("1 - Approve Application");
            System.out.println("2 - Deny Application");
            int option = 0;
            scanner = new Scanner(System.in);
            option = scanner.nextInt();
            while (option < 1 || option > 2) {
                System.out.println("\nOption not valid please try again.");
                scanner = new Scanner(System.in);
                option = scanner.nextInt();
            }
            switch (option) {
                case 1:
                    Account account = new Account();
                    account.getAccountNumber();
                    account.getSavingBalance();
                    account.getCheckingBalance();
                    aadao.addBank(account);
                    System.out.println("\nApplication Approved!");
                    bdao.addAccountRelationship(applications1.getId(), aadao.getNewAccountId());
                    adao.deleteApplication(applications1.getId());
                    break;
                case 2:
                    adao.deleteApplication(applications1.getId());
                    System.out.println("\nApplication Denied!");
                    break;
            }
        }
    }
    public void allCustomersMenu() throws SQLException {
        System.out.println("\n*************************");
        System.out.println("* All Current Customers *");
        System.out.println("*************************");
        List<User> customers = dao.getEmployees();
        for (User customer: customers) {
            System.out.println("\nId: "+customer.getUser_id()+" | Name: "+customer.getUser_firstname()+" "+customer.getUser_lastname()+" | Email: "+customer.getUser_username() );
        }
    }

    public void customerAccountMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a Customer Id.");
        int id = scanner.nextInt();
        System.out.println("\n***********************");
        System.out.println("* Customer's Accounts *");
        System.out.println("***********************");
        System.out.println("Please select an Account by AccountId to view ALl Transactions.");
        List<Bank> customerAccounts = bdao.;
        for (Bank accounts: customerAccounts) {
            System.out.println("\nCustomerId: "+accounts.getPin()+" | AccountId: "+accounts.getAccountNumber()+" |" +
                    " Account Balance: "+accounts.getCheckingBalance()+" | Account Type: "+accounts.getSavingBalance());
        }
        id = scanner.nextInt();

        System.out.println("\n****************************");
        System.out.println("* All Account Transactions *");
        System.out.println("****************************");
        bdao.accountHistory(id);
    }

    public void addEmployeeMenu() throws SQLException {
        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Employee First Name");
        employee.setFirstname(scan.next());
        System.out.println("Enter Employee Last Name");
        employee.setLastname(scan.next());
        System.out.println("Enter Employee Username");
        employee.setUsername(scan.next());
        System.out.println("Enter Employee Password");
        employee.setPassword(scan.next());
        System.out.println("Enter Employee Email");
        employee.setEmail(scan.next());
        dao.addEmployee(employee);
    }

    public void UserloggedInMenu() {
    }
}