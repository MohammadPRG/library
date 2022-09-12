package Database;

import java.sql.*;

public class Connection {
    private static Connection connection;

    private Connection() {
    }

    public static Connection getInstance() throws SQLException {
        if (connection == null)
            connection = (Connection) DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
        return connection;
    }
}
