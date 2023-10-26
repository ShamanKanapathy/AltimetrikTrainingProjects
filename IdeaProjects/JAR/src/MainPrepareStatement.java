import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainPrepareStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/altimetrik";
        String username = "root";
        String password = "root123";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?)");
           // PreparedStatement pstmt = con.prepareStatement("UPDATE  employye SET salary =? WHERE id = ?");
           // PreparedStatement pstmt = con.prepareStatement("DELETE FROM employye WHERE id = ?");
            pstmt.setString(1, "Ravi");
            pstmt.setInt(2, 37000);
            pstmt.setInt(3, 123);
            pstmt.setString(4 , "ravi@22gmail.com");
            int result = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}