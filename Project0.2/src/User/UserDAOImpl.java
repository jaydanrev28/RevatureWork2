package User;
import User.User;
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
        String sql = "insert into customer (first_name, last_name, username, password) values (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, acc.getUser_firstname());
        preparedStatement.setString(2, acc.getUser_lastname());
        preparedStatement.setString(3, acc.getUser_username());
        preparedStatement.setString(4, acc.getUser_password());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Customer saved");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public boolean loginUser(String user_username, String user_password) throws SQLException {
        String sql = "select * from customer where username = ? and password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user_username);
        preparedStatement.setString(2, user_password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            return true;
        else
            return false;

    }

    @Override
    public User currentUser(String user_username, String user_password) throws SQLException {
        User acc = new User();
        String sql = "Select * from customer where username = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user_username);
        preparedStatement.setString(2, user_password);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {

            acc.setUser_id(resultSet.getInt(1));
            acc.setUser_firstname(resultSet.getString(2));
            acc.setUser_lastname(resultSet.getString(3));
            acc.setUser_username(resultSet.getString(4));
            acc.setUser_password(resultSet.getString(5));

        }
        return acc;
    }

    @Override
    public void getCustomers() throws SQLException {
        String sql = "select * from customer";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String firstname = resultSet.getString(2);
            String lastname = resultSet.getString(3);

            System.out.println("Id = " + id + ", First Name = " + firstname + ", Last Name: " + lastname);
        }
    }
}