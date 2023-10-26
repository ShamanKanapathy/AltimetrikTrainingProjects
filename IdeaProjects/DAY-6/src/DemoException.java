import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoException{


    void display() throws ClassNotFoundException, SQLException {

        Class.forName("sk");

        DriverManager.getConnection("");
    }

    public static void main(String[] args) {
            DemoException d=new DemoException();
            try{
                d.display();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("error");
            }

    }
}
