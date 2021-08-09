package User;

import User.User;

import java.sql.SQLException;

public interface UserDAO {
    void registerUser(User acc) throws SQLException;
    void loginUser(User acc) throws SQLException;
}
