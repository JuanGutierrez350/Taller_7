package co.edu.sena.projectv2687350.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static String url =
            "jdbc:mysql://127.0.0.1:3306/MyApp?serverTimezone=America/Bogota";
    private static String user = "valencia";
    private static String pass = "Juan/1021669526";

    private static BasicDataSource pool;
    private static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);

            pool.setInitialSize(5);
            pool.setMinIdle(5);
            pool.setMaxIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }
    public static Connection getConnection()
        throws SQLException{
        return getInstance().getConnection();
    }
}
