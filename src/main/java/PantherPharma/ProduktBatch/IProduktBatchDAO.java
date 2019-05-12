package PantherPharma.ProduktBatch;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IProduktBatchDAO {

    // Create
    void createProduktbatch(IProduktBatchDTOImpl produktbatch, Connection connection) throws DALException;

    // Read
    IProduktBatchDTOImpl getProduktbatch(int id, Connection connection) throws DALException;
    List<IProduktBatchDTOImpl> getProduktbatchList(Connection connection) throws DALException;

    // Update
    boolean updateProduktbatch(IProduktBatchDTOImpl produktbatch, Connection connection) throws DALException;

    // Delete
    boolean deleteProduktbatch(int id, Connection connection) throws DALException;


}
