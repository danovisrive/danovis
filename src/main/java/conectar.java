import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
    public static void main(String[] args)throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql:localhost://bd_agenda",
                "root",
                "");
        con.close();
    }
}