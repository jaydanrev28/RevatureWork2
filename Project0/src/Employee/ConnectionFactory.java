package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection = null;
    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException  {
        if (connection == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("User/dbConfig");
            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            connection = DriverManager.getConnection(url, username, password);
        }
        // Step 1: load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        // Step 2: Create connection Object
       // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "LinuxGang2020!");
        // Step 3: Create Statement Object
      //  Statement statement = conn.createStatement();

        // Step 4: Execute Query
       // ResultSet rs = statement.executeQuery("select * from employee" );
        //while (rs.next()) {
        //System.out.println("Id: " + rs.getInt(1) + "\n" + "First Name: "
          //          + rs.getString(2) +"\n" + "Last Name:" + rs.getString(3) + "\n"+"Password:" +
            //       rs.getString(4));


       // String query = "delete from employee where id =  ?";
        //PreparedStatement preparedStatement = conn.prepareStatement(query);
        //preparedStatement.setInt(1, 6);
        //int rowAffected = preparedStatement.executeUpdate();
        //System.out.println("(" + rowAffected + ") rows affected");



//
        // Step 5: Close the connection
        //conn.close();
        return connection;


    }
}

