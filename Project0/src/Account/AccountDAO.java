package Account;

import Bank.Bank;

import java.sql.SQLException;

public interface AccountDAO {
    void addAccount(Account account) throws SQLException;
    int getNewAccountId() throws SQLException;
}