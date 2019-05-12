package PantherPharma.Produkt;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IProduktDAO {

    // Create
    void createProdukt(IProduktDTOImpl produkt, Connection connection) throws DALException;

    // Read
    IProduktDTOImpl getProdukt(int id, Connection connection) throws DALException;
    List<IProduktDTOImpl> getProduktList(Connection connection) throws DALException;

    // Update
    boolean updateProdukt(IProduktDTOImpl produkt, Connection connection) throws DALException;

    // Delete
    boolean deleteProdukt(int id, Connection connection) throws DALException;

}
