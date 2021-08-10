package Applications;

public class ApplicationsDAOFactory {
    private static ApplicationDAO adao;

    private ApplicationsDAOFactory() {}

    public static ApplicationDAO getApplicationsDAO() {
        if(adao == null)
            adao = new ApplicationsDAOImpl();
        return adao;
    }
}
