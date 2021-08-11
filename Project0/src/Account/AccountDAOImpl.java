package Account;
import Bank.Bank;
import Employee.ConnectionFactory;
import java.sql.*;

public class AccountDAOImpl implements AccountDAO{

    private static Statement statement = null;
    Connection connection = null;

    public AccountDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        String sql = "Insert into bank (account_number, savings, checkings) " +
                "values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, account.getAccountNumber());
        preparedStatement.setInt(2, account.getSavingBalance());
        preparedStatement.setInt(3,account.getCheckingBalance());
        int count = preparedStatement.executeUpdate();
        if (count > 0){

        }
        else
            System.out.println("\nOops! Something went wrong.");

    }

    @Override
    public int getNewAccountId() throws SQLException {
        int id = 0;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select max(account_number) from bank");
        while (resultSet.next()) {
            id = resultSet.getInt(1);
        }
        return id;
    }
}
