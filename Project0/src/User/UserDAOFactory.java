package User;

import Bank.BankDAO;
import Bank.BankDAOImpl;

public class UserDAOFactory {
    private static UserDAO udao;

    private UserDAOFactory(){}

    public static UserDAO getUserDao(){
        if(udao==null)
            udao = new UserDAOImpl();
        return udao;
    }
}
