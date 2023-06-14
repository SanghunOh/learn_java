package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnyStatements {
    public ResultSet selectStatement(Statement statemt, String qy) throws SQLException{
        ResultSet resultSet = statemt.executeQuery(qy);
        return resultSet;
    }
}
