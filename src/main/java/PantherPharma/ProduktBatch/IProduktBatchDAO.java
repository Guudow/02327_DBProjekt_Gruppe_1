package PantherPharma.ProduktBatch;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IProduktBatchDAO {

    // Create
    void createProduktbatch(IProduktBatchDTO produktbatch) throws DALException;

    // Read
    IProduktBatchDTO getProduktbatch(int produktbatchId) throws DALException;
    List<IProduktBatchDTO> getProduktbatchList() throws DALException;

    // Update
    void updateProduktbatch(IProduktBatchDTO produktbatch) throws DALException;

}
