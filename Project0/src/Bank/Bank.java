package Bank;

public class Bank {
    private String firstName;
    private String lastName;
    private String password;
    private int pin;
private int accountNumber;
private int checkingBalance;
private int savingBalance;
private int deposit;
private int withdraw;
    public Bank(){

    }

    public Bank(int pin, String firstName, String lastName, String password, int accountNumber,int checkingBalance,int savingBalance, int deposit, int withdraw) {
        this.pin = pin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password =password;
        this.accountNumber= accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.deposit = deposit;
        this.withdraw = withdraw;

    }

    public Bank(int anInt, String string, String string1, String string2, int anInt1, int anInt2, int anInt3) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(int checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}
