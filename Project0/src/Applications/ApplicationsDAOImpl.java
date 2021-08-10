package Applications;

import Employee.ConnectionFactory;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationsDAOImpl implements ApplicationDAO {
    private static Statement statement = null;
    Connection connection = null;

    public ApplicationsDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void userApplication(Applications application) throws SQLException {
        String sql = "insert into bank ( first_name, last_name, password, checkings, savings) values (?,?,?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, application.getFirstname());
        preparedStatement.setString(2, application.getLastname());
        preparedStatement.setInt(3, application.getCheckingBalance());
        preparedStatement.setInt(4,application.getSavingBalance());
        preparedStatement.setString(5, application.getAccountType());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("\nApplication saved.");
        else
            System.out.println("\nOops! Something went wrong.");
    }

    @Override
    public List<Applications> getApplication() throws SQLException {
        List<Applications> applications = new ArrayList<>();
        Statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from bank");
        while (resultSet.next()) {
            Applications application = new Applications(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getDouble(4), resultSet.getString(5), resultSet.getInt(6),resultSet.getInt(7));
            applications.add(application);
        }
        return applications;
    }

    @Override
    public Applications getApplicationById(int id) throws SQLException {
        String sql = "Select * from bank where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Applications application = new Applications(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3),resultSet.getInt(4), resultSet.getString(4), resultSet.getInt(5),resultSet.getInt(6));
            return application;
        }
        else
            System.out.println("Application does not exist.");
        return null;
    }

    @Override
    public void deleteApplication(int id) throws SQLException {
        String sql = "Delete from customer where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0){

        }
        else
            System.out.println("\nOops! Something went wrong.");
    }

}
