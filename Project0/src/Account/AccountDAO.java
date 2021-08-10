package Account;

import Bank.Bank;

import java.sql.SQLException;

public interface AccountDAO {
    void addBank(Bank account) throws SQLException;
    int getNewAccountId() throws SQLException;
}