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
        public List<Bank> allCustomersAccounts(int pin) throws SQLException {
            List<Bank> customerAccounts = new ArrayList<>();
            String sql = " select * from bank where pin = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,pin );

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Bank accounts = new Bank(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5), resultSet.getInt(6),resultSet.getInt(7));
                customerAccounts.add(accounts);
            }
            return customerAccounts;
        }

        @Override
        public void accountHistory(int id) throws SQLException {
            String sql = "select * from bank";
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





