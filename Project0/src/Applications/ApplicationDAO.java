package Applications;

import java.sql.SQLException;
import java.util.List;

public interface ApplicationDAO {
    void userApplication(Applications application) throws SQLException;
    List<Applications> getApplication() throws SQLException;
    Applications getApplicationById(int id) throws SQLException;
    void deleteApplication(int id) throws SQLException;
}
