package Employee;

import Employee.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    void getEmployees(Employee Employee)throws SQLException;
    Employee employeeById(int id)throws SQLException;
    boolean verifyLogin(String username, String password) throws SQLException;
}
