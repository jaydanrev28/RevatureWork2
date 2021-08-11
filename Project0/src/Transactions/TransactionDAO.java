package Transactions;

import Bank.Bank;

import java.sql.SQLException;

public interface TransactionDAO {
    void startTransaction(Bank account) throws SQLException;
    void depositCheckings(Bank account) throws SQLException;
    void depositSavings(Bank account) throws SQLException;
    void withdrawCheckings(int pin) throws SQLException;
    void withdrawSavings(int pin)throws SQLException;
}
