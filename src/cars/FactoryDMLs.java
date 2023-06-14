package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDMLs {
    public ResultSet selectStatements(Statement statement, String query) throws SQLException{
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public int insertStatements(Statement statement, String query) throws SQLException{
        int count = statement.executeUpdate(query);
        return count;
    }
}
