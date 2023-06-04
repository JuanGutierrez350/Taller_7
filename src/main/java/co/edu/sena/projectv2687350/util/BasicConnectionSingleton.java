package co.edu.sena.projectv2687350.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectionSingleton {

    private static String url = "jdbc:mysql://127.0.0.1:3306/MyApp?" +
            "serverTimezone=America/Bogota";

    private  static String user = "valencia";
    private static String pass = "Juan/1021669526";

    private static Connection conn;

    public static Connection getInstance()
        throws SQLException{
        if (conn == null) {
            conn =
                    DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
}
