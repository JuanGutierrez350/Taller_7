package co.edu.sena.projectv2687350.util;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseBasicConnectionSingleton {

    public static void main(String[] args) throws SQLException {
        try (Connection conn =
                     BasicConnectionSingleton.getInstance();
             Statement stmt =
                     conn.createStatement();
             ResultSet rs =
                     stmt.executeQuery("SELECT * FROM MyApp.users_tbl")) {
            while (rs.next()) {
                System.out.print(rs.getString("user_firstname"
                ));

            }
        }
    }
}
