import java.sql.*;

public class MainCallableStatementFunction {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/altimetrik";
            String username = "root";
            String password = "root123";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(url,username,password);
                CallableStatement cstmt =con.prepareCall("{?= CALL altimetrik.add(?,?)}");
                cstmt.setInt(2,2);
                cstmt.setInt(3,5);
                cstmt.registerOutParameter(1,Types.INTEGER);
                cstmt.execute();
                System.out.println(cstmt.getInt(1));
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }

