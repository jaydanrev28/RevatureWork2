package Transactions;

import User.User;

public class Transaction {
    private int transaction_id ;
    private int cust_id;
    private int acct_id;
    private int saving_balance;
    private double withdraw;
    private double deposit;
    private double savingsend_bal;
    private double checkingend_bal;

    public Transaction(int transaction_id, int cust_id, int acct_id, int saving_balance, double withdraw, double deposit, double savingsend_bal, double checkingend_bal) {
        this.cust_id = cust_id;
        this.transaction_id = transaction_id;
        this.acct_id = acct_id;
        this.saving_balance = saving_balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.savingsend_bal = savingsend_bal;
        this.checkingend_bal = checkingend_bal;
    }

    public Transaction() {

    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public int getSaving_balance() {
        return saving_balance;
    }

    public void setSaving_balance(int saving_balance) {
        this.saving_balance = saving_balance;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getSavingsend_bal() {
        return savingsend_bal;
    }

    public void setSavingsend_bal(double savingsend_bal) {
        this.savingsend_bal = savingsend_bal;
    }

    public double getCheckingend_bal() {
        return checkingend_bal;
    }

    public void setCheckingend_bal(double checkingend_bal) {
        this.checkingend_bal = checkingend_bal;
    }
}
