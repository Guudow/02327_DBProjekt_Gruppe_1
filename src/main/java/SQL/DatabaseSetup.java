package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Exception.DALException;

/**
 * @class sets up the database
 * @author s185021
 */
public class DatabaseSetup {

    /**
     * @param args very important to run this method first.
     * @throws DALException
     */
    public static void main(String[] args) throws DALException {
        createNewTable();
        dropTablesFromDatabase();
        createNewTable();
    }


    /**
     * @return connects to the database
     * @throws SQLException
     * @author s185021 & s185017
     */
    public static Connection createConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s185021?",
                "s185021",
                "wI8UOBFma7VPoCVDDUTmw");

        /*

        return DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s185017?",
            "s185017",
            "oRJI59AKrhyxR4q5tG5Af");

         */

    }

    /**
     * @throws DALException
     * @method creates all the important tables to this assignment
     * @author s185021
     */
    public static void createNewTable() throws DALException {
        try (Connection connection = createConnection()) {
            connection.setAutoCommit(false);

            PreparedStatement Producent = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Producent (" +
                    "  producentID INT NOT NULL," +
                    "  producentNavn TEXT NOT NULL," +
                    "  PRIMARY KEY (producentID));");

            PreparedStatement Råvarer = connection.prepareStatement
            ("CREATE TABLE IF NOT EXISTS Råvarer (\n" +
                    "  råvarerID INT NOT NULL,\n" +
                    "  indholdsstofID INT NOT NULL,\n" +
                    "  sumAfRåvarerBatches INT NULL,\n" +
                    "  råvarerNavn TEXT NULL,\n" +
                    "  genbestilling BIT NULL,\n" +
                    "  PRIMARY KEY (råvarerID));");

            PreparedStatement RåvarerBatch = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS RåvarerBatch (\n" +
                            "  råvarerBatchID INT NOT NULL,\n" +
                            "  producentID INT NULL,\n" +
                            "  råvarerID INT NOT NULL,\n" +
                            "  vægt DECIMAL(12,4) NULL,\n" +
                            "  minimumsMængde DECIMAL(12,4) NULL,\n" +
                            "  PRIMARY KEY (råvarerBatchID),\n" +
                            "  FOREIGN KEY (råvarerID) REFERENCES Råvarer(råvarerID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY (producentID) REFERENCES Producent (producentID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Bruger = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Bruger (\n" +
                            "  brugerID INT NOT NULL,\n" +
                            "  brugerNavn TEXT NULL,\n" +
                            "  rolleID INT NULL,\n" +
                            "  rolleNavn TEXT NOT NULL,\n" +
                            "  PRIMARY KEY (brugerID));");

            PreparedStatement Laborant = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Laborant (\n" +
                            "  rolleID INT NOT NULL DEFAULT 2,\n" +
                            "  brugerID INT NULL,\n" +
                            "  PRIMARY KEY (rolleID),\n" +
                            "  FOREIGN KEY (brugerID) REFERENCES Bruger (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Indholdsstof = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Indholdsstof (\n" +
                            "  indholdsstofID INT NOT NULL,\n" +
                            "  råvarerID INT NULL,\n" +
                            "  brugerID INT NOT NULL,\n" +
                            "  hjælpestof TEXT NULL,\n" +
                            "  aktivtstof TEXT NULL,\n" +
                            "  procentuelAfvigelse DECIMAL(5,2) NULL,\n" +
                            "  PRIMARY KEY (indholdsstofID),\n" +
                            "  FOREIGN KEY (råvarerID) REFERENCES Råvarer (råvarerID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY (brugerID) REFERENCES Laborant (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Farmaceut = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Farmaceut (\n" +
                            "  rolleID INT NOT NULL DEFAULT 1,\n" +
                            "  brugerID INT NULL,\n" +
                            "  PRIMARY KEY (rolleID),\n" +
                            "  FOREIGN KEY (brugerID) REFERENCES Bruger (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Opskrift = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Opskrift (\n" +
                            "  opskriftID INT NOT NULL,\n" +
                            "  indholdsstofID INT NULL,\n" +
                            "  brugerID INT NULL,\n" +
                            "  dato DATETIME NOT NULL,\n" +
                            "  udgave VARCHAR(45) NOT NULL,\n" +
                            "  PRIMARY KEY (opskriftID),\n" +
                            "  FOREIGN KEY  (indholdsstofID) REFERENCES Indholdsstof (indholdsstofID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY  (brugerID) REFERENCES Farmaceut (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Produkt = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Produkt (\n" +
                            "  produktID INT NOT NULL,\n" +
                            "  råvarerID INT NULL,\n" +
                            "  opskriftID INT NULL,\n" +
                            "  råvarerbatchID INT NULL,\n" +
                            "  brugerID INT NULL,\n" +
                            "  produktNavn TEXT NULL,\n" +
                            "  PRIMARY KEY (produktID),\n" +
                            "  FOREIGN KEY  (råvarerID) REFERENCES Råvarer (råvarerID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY  (opskriftID) REFERENCES Opskrift (opskriftID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY  (råvarerbatchID) REFERENCES RåvarerBatch (råvarerBatchID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY  (brugerID) REFERENCES Laborant (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Produktleder = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Produktleder (\n" +
                            "  rolleID INT NOT NULL DEFAULT 3,\n" +
                            "  brugerID INT NULL,\n" +
                            "  PRIMARY KEY (rolleID),\n" +
                            "  FOREIGN KEY (brugerID) REFERENCES Bruger (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement ProduktBatch = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS ProduktBatch (\n" +
                            "  produktBatchID INT NOT NULL,\n" +
                            "  produktID INT NULL,\n" +
                            "  brugerID INT NULL,\n" +
                            "  vægt DECIMAL(12,4) NULL,\n" +
                            "  PRIMARY KEY (produktBatchID),\n" +
                            "  FOREIGN KEY  (produktID) REFERENCES Produkt (produktID) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                            "  FOREIGN KEY  (brugerID) REFERENCES Produktleder (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement GammelOpskrift = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS GammelOpskrift (\n" +
                            "  gammelOpskriftID INT NOT NULL,\n" +
                            "  opskriftID INT NULL,\n" +
                            "  dato DATETIME NOT NULL,\n" +
                            "  udgave VARCHAR(45) NOT NULL,\n" +
                            "  PRIMARY KEY (gammelOpskriftID),\n" +
                            "  FOREIGN KEY (opskriftID) REFERENCES Opskrift (opskriftID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            PreparedStatement Administrator = connection.prepareStatement
                    ("CREATE TABLE IF NOT EXISTS Administrator (\n" +
                            "  rolleID INT NOT NULL DEFAULT 4,\n" +
                            "  brugerID INT NULL,\n" +
                            "  PRIMARY KEY (rolleID),\n" +
                            "  FOREIGN KEY (brugerID) REFERENCES Bruger (brugerID) ON DELETE NO ACTION ON UPDATE NO ACTION);");

            Producent.execute();
            Råvarer.execute();
            RåvarerBatch.execute();
            Bruger.execute();
            Laborant.execute();
            Indholdsstof.execute();
            Farmaceut.execute();
            Opskrift.execute();
            Produkt.execute();
            Produktleder.execute();
            ProduktBatch.execute();
            GammelOpskrift.execute();
            Administrator.execute();

            connection.commit();

        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    /**
     * @throws DALException
     * @method drops current tables in the database
     * @author s185021
     */
    public static void dropTablesFromDatabase() throws DALException {
        try (Connection connection = createConnection()){
            connection.setAutoCommit(false);

            PreparedStatement dropAllTables = connection.prepareStatement
                    ("DROP TABLE Producent,Råvarer,RåvarerBatch,Bruger,Laborant,Indholdsstof," +
                            "Farmaceut,Opskrift,Produkt,Produktleder, ProduktBatch,GammelOpskrift,Administrator;");

            dropAllTables.execute();

            connection.commit();

        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

}
