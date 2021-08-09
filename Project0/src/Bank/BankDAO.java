package Bank;
import Bank.Bank;
import java.sql.SQLException;
import java.util.List;

public interface BankDAO {

    void startTransaction(Bank account) throws SQLException;
    void depositCheckings(Bank account) throws SQLException;
    void depositSavings(Bank account) throws SQLException;
    void withdrawCheckings(int pin) throws SQLException;
    void withdrawSavings(int pin)throws SQLException;
    void receiveAccount (Bank account) throws SQLException;
    //void cancelTransaction(Bank account) throws SQLException;
}
