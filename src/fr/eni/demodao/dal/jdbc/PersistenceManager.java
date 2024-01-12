package fr.eni.demodao.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class PersistenceManager {

    private static Connection connection;

    private static final String DB_URL;
    private static final String DB_USER;
    private static final String DB_PWD;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("database.url");
        DB_USER = bundle.getString("database.user");
        DB_PWD = bundle.getString("database.password");
    }

    private PersistenceManager() {}//prevent initialization

    public static Connection getConnection() throws SQLException {
        if (null == connection || !connection.isValid(1)) {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if( null != connection && connection.isValid(1)) {
            connection.close();
        }
    }
}
