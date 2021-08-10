package User;

import User.User;

import java.sql.SQLException;

public interface UserDAO {
    void registerUser(User acc) throws SQLException;
    //boolean loginUser(User acc) throws SQLException;
   // User currentUser(User acc) throws SQLException;

    Object currentUser(String user_username, String user_password)throws SQLException;

    boolean loginUser(String user_username, String user_password)throws SQLException;
}
