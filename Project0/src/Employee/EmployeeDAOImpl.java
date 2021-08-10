package Employee;

import Employee.Employee;

import java.sql.*;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into customer (id, first_name, last_name, username, password) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getFirstname());
        preparedStatement.setString(3, employee.getLastname());
        preparedStatement.setString(4, employee.getUsername());
        preparedStatement.setString(5, employee.getPassword());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("customer saved");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update customer set first_name = ?, last_name = ?, username = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getFirstname());
        preparedStatement.setString(3, employee.getLastname());
        preparedStatement.setString(4, employee.getUsername());
        preparedStatement.setString(5, employee.getPassword());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("customer updated");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from customer where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("customer deleted");
        else
            System.out.println("Oops! something went wrong");
    }

   @Override
    public void getEmployees(Employee employee) throws SQLException {
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


        @Override
        public Employee employeeById(int id) throws SQLException{
           Employee employee = new Employee();
            String sql = "select * from customer where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet2 = preparedStatement.executeQuery(sql);
          while(resultSet2.next())
            id = resultSet2.getInt(1);
            String firstname = resultSet2.getString(2);
            String lastname = resultSet2.getString(3);
            String password = resultSet2.getString(4);
            String email = resultSet2.getString(5);
            employee = new Employee(id,firstname,lastname, password, email);
            return employee;
        }
    @Override
    public boolean verifyLogin(String email, String password) throws SQLException {
        String sql = "Select * from employees where email = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            return true;
        else
            return false;
    }
}
