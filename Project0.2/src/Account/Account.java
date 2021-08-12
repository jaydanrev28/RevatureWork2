package Account;

import java.util.Date;

public class Account {

    private int id;
    private int accountNumber;
    private int checkingBalance;
    private int savingBalance;
    private double balance;
    private String type;

    public Account() {}

    public Account(int id, double balance, String type, int accountNumber, int checkingBalance, int savingBalance) {
        this.id = id;
        this.balance = balance;
        this.type = type;
        this.accountNumber = accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}