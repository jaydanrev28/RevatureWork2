package Transactions;

import Bank.Bank;

import java.sql.SQLException;

public interface TransactionDAO {
    void startTransaction(Transaction transaction) throws SQLException;
    void depositCheckings(Bank account) throws SQLException;
    void depositSavings(Bank account) throws SQLException;
    void withdrawCheckings(Bank account) throws SQLException;
    void withdrawSavings(Bank account)throws SQLException;
}
