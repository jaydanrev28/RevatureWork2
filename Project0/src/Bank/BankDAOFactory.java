package Bank;

public class BankDAOFactory {
    private static BankDAO bdao;

    private BankDAOFactory(){}

    public static BankDAO getBankDao(){
        if(bdao==null)
            bdao = new BankDAOImpl();
        return bdao;
    }
}
