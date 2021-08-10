package Account;

public class AccountDAOFactory {

    private static AccountDAO aadao;

    private AccountDAOFactory() {}

    public static AccountDAO getAccountDao() {
        if(aadao == null)
            aadao = new AccountDAOImpl();
        return aadao;
    }
}