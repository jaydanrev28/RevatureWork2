package Bank;
import Employee.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDAOImpl implements BankDAO {

    private static Statement statement = null;
    Connection connection = null;

    public BankDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void startTransaction(Bank account) throws SQLException {
        String sql = "start transaction";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, account.getFirstName());
        preparedStatement.setString(2, account.getLastName());
        preparedStatement.setString(3, account.getPassword());
        preparedStatement.setInt(4,account.getAccountNumber());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Transaction begin");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void depositCheckings(Bank account) throws SQLException {
        String sql = "update bank set checkings = checkings +? where pin = ?";
       // String sql2 = "rollback";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
       // PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement.setInt(1, account.getPin());
        preparedStatement.setString(2, account.getPassword());
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
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Money Deposited");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void withdrawCheckings(int pin) throws SQLException {
        String sql = "update bank set checkings = checkings -? where pin = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, pin);

        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Withdrawn from checking");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void withdrawSavings(int pin) throws SQLException {
        String sql = "update bank set savings = savings -? where pin = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, pin);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Withdrawn from saving");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void receiveAccount(Bank account) throws SQLException {
        String sql = "select * from bank where account_number = ? and pin = ?";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int pin = resultSet.getInt(1);
            int accountNumber = resultSet.getInt(2);


            System.out.println("Pin = " + pin + ", Account Number" + accountNumber);

        }
    }
        @Override
        public void addAccountRelationship(int pin, int accountId) throws SQLException {
            String sql = "Insert into bank (CustomerId, AccountId) " +
                    "values (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pin);
            preparedStatement.setInt(2, accountId);
            int count = preparedStatement.executeUpdate();
            if (count > 0) {
            }
            else
                System.out.println("\nOops! Something went wrong.");

        }

        @Override
        public List<Bank> allCustomersAccounts(int customerId) throws SQLException {
            List<Bank> customerAccounts = new ArrayList<>();
            String sql = " select * from Bank";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Bank accounts = new Bank(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5));
                customerAccounts.add(accounts);
            }
            return customerAccounts;
        }

        @Override
        public void accountHistory(int id) throws SQLException {
            String sql = "select * from accounthistory";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String amount = resultSet.getString(2);
                Date date = resultSet.getDate(3);
                System.out.println("\nTransaction: "+amount+" | Date: "+date);
            }
            else
                System.out.println("\nThere is no transaction history");
        }


}


