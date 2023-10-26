
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/altimetrik";
        String username = "root";
        String password = "root123";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt =con.createStatement();
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES('SO',5,543,'DF@GMAIL.COM')");
            boolean result=stmt.execute("INSERT INTO EMPLOYEE VALUES('OG',6,437,'FISH@GMAIL.COM')");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("HELLO?!?!?!?!?");
        }
    }
}
