package Bank;
import Bank.Bank;
import java.sql.SQLException;
import java.util.List;

public interface BankDAO {


    void receiveAccount (Bank account) throws SQLException;
    void addAccountRelationship(int pin, int accountNumber) throws SQLException;
    List<Bank> allCustomersAccounts(int pin) throws SQLException;
    void accountHistory(int pin) throws SQLException;

    //void cancelTransaction(Bank account) throws SQLException;
}
