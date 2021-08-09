package User;
import Employee.ConnectionFactory;
import Employee.Employee;

import java.sql.*;
public class UserDAOImpl implements UserDAO {
    private static Statement statement = null;
    Connection connection = null;
    public UserDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void registerUser(User acc) throws SQLException {
        String sql = "insert into customer (id, first_name, last_name, username, password) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, acc.getUser_id());
        preparedStatement.setString(2, acc.getUser_firstname());
        preparedStatement.setString(3, acc.getUser_lastname());
        preparedStatement.setString(4, acc.getUser_username());
        preparedStatement.setString(5, acc.getUser_password());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Customer saved");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void loginUser(User acc) throws SQLException {
        String sql = "update customer set first_name = ?, last_name = ?, username = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, acc.getUser_id());
        preparedStatement.setString(2, acc.getUser_firstname());
        preparedStatement.setString(3, acc.getUser_lastname());
        preparedStatement.setString(4, acc.getUser_username());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("customer updated");
        else
            System.out.println("Oops! something went wrong");
    }
}
