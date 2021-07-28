class UserAlreadyLoggedInException extends Exception{

}

class Authentication{

    private boolean isLoggedIn = false;
    public void login(String email, String password) throws UserAlreadyLoggedInException {
        if (!isLoggedIn) {
            if (email.equals("admin") && password.equals("4567")) {
                isLoggedIn = true;
                System.out.println("You've logged in");
            } else {
                System.out.println("login failed! Try again next time!");
            }
            throw new UserAlreadyLoggedInException();
        }
    }
    }

public class Practice21 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try {
            auth.login("admin", "345");
        } catch (UserAlreadyLoggedInException e) {
            e.printStackTrace();
        }
        try {
            auth.login("admin", "4567");
        } catch (UserAlreadyLoggedInException e) {
            //e.printStackTrace();
            System.out.println("Hey! you already logged In");
        }
    }
}