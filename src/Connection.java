import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public static java.sql.Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s185021?",
                "s185021",
                "wI8UOBFma7VPoCVDDUTmw");
    }

}
