//procedure

import java.sql.*;
public class MainCallableStatementProcedure {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/altimetrik";
            String username = "root";
            String password = "root123";
            try {
                Connection con = DriverManager.getConnection(url,username,password);
                CallableStatement cstmt =con.prepareCall("{CALL getAllEmployees(?,?)}");
                cstmt.setInt(1,6);
                cstmt.registerOutParameter(2,Types.INTEGER);
                cstmt.execute();
                System.out.println(cstmt.getInt(2)
                );
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error");
            }
        }
    }

