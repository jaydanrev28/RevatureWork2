package User;

public class User {
    private int user_id;
    private String user_firstname;
    private String user_lastname;
    private String user_username;
    private String user_password;
    private User currentUser;


    public User(int user_id, String user_firstname,String user_lastname,String user_username, String user_password) {
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_username = user_username;
        this. user_password = user_password;
    }

    public User(Object currentUser) {
    }

    public User() {

    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public static void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public static void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_username() {
        return user_username;
    }

    public static void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public static void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void setStartBalance(int i) {
    }
}
