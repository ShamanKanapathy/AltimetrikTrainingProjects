package jdbcDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {

    public Connection connect() throws SQLException, ClassNotFoundException {
        Connection con = null;

            String url = "jdbc:mysql://localhost:3306/remitter";
            String username = "root";
            String password = "root123";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);
            return con;
        }

    }
