package co.edu.sena.projectv2687350.util;

import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url =
                "jdbc:mysql://127.0.0.1:3306/MyApp?serverTimezone=America/Bogota";
        String username = "valencia";
        String password = "Juan/1021669526";
        String sql = "SELECT * FROM MyApp.users_tbl";
        try (Connection conn =
                     DriverManager.getConnection(url,
                             username, password);
             Statement stmt =
                     conn.createStatement();
             ResultSet rs =
                     stmt.executeQuery(sql)) {
            while (rs.next()) {

                System.out.println(rs.getString("user_firstname"));

                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}

