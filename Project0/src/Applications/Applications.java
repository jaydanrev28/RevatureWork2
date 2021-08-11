package Applications;

public class Applications {
    private int accountNumber;
    private String firstname;
    private String lastname;

    private String accountType;
    private int id;
    private int checkingBalance;
    private int savingBalance;

    public Applications(int accountNumber, String firstname, String lastname, double startBalance, String accountType, int checkingBalance,
                        int savingBalance) {
        this.accountNumber = accountNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.accountType = accountType;
        this.id = id;
    }

    public Applications() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
