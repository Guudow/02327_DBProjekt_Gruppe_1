package DAL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
        public Connection createConnection() throws DALException {
            try {
                System.out.println("Connecting to a selected database...");
                return DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com:3306/s164497?",
                        "s164497",
                        "Ukup0gpSceh8YVvNkjPad");
            } catch (SQLException e) {
                throw new DALException(e.getMessage());
            }
        }

}

class DALException extends Exception {
    //Til Java serialisering...
    private static final long serialVersionUID = 7355418246336739229L;

    public DALException(String msg, Throwable e) {
        super(msg,e);
    }

    public DALException(String msg) {
        super(msg);
    }

}
