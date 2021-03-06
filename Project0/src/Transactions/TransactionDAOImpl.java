package Transactions;

import Bank.Bank;
import Employee.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAOImpl implements TransactionDAO{
    private static Statement statement = null;
    Connection connection = null;

    public TransactionDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //connection.setAutoCommit(false);
    }
    @Override
    public void startTransaction(Transaction transaction) throws SQLException {
        String sql = "start transaction";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, transaction.getCust_id());
        preparedStatement.setInt(2, transaction.getTransaction_id());

        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Transaction begin");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void depositCheckings(Bank account) throws SQLException {

        String sql2 = "update bank set checkings = checkings +? where pin = ?";
        // String sql2 = "rollback";
        PreparedStatement preparedStatement = connection.prepareStatement(sql2);
        // PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement.setInt(1, account.getPin());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setInt(3,account.getDeposit());
        //  int count2 = preparedStatement2.executeUpdate();
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Money Deposited");
        /*if (count2 < 0)
            System.out.println("Transaction canceled");*/
        else
            System.out.println("Rolling back data here....");
        try{
            if(connection!=null)
                connection.rollback();
        }catch(SQLException se2){
            se2.printStackTrace();
        }
        System.out.println("Oops! something went wrong");



    }

    @Override
    public void depositSavings(Bank account) throws SQLException {
        String sql = "update bank set savings = savings +? where pin = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, account.getPin());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setInt(3,account.getDeposit());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Money Deposited");
        else
            System.out.println("Rolling back data here....");
        try{
            if(connection!=null)
                connection.rollback();
        }catch(SQLException se2){
            se2.printStackTrace();
        }
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void withdrawCheckings(Bank account) throws SQLException {
        String sql = "update bank set checkings = checkings -? where pin = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, account.getPin());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setInt(3,account.getWithdraw());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Withdrawn from checking");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void withdrawSavings(Bank account) throws SQLException {
        String sql = "update bank set savings = savings -? where pin = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, account.getPin());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setInt(3,account.getWithdraw());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Withdrawn from saving");
        else
            System.out.println("Oops! something went wrong");
    }

}
