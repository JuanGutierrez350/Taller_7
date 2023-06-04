package co.edu.sena.projectv2687350.util;

import java.sql.*;

public class BasicConnection {

    public static void main(String[] args)
    {
        String url = "jdbc:mysql://127.0.0.1:3306/MyApp?server" +
                "Timezone=America/Bogota";
        String username = "valencia";
        String password = "Juan/1021669526";

        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;

        try {
            sql = "SELECT * FROM MyApp.users_tbl";

            conn =
                    DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");

                System.out.println(rs.getString("user_lastname"));
            }

                } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
        }
    }

