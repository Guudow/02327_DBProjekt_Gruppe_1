package PantherPharma.ProduktBatch;

import java.util.List;

import PantherPharma.Exception.DALException;

public interface IProduktBatchDAO {

    // Create
    void createProduktbatch(IProduktBatchDTO produktbatch) throws DALException;

    // Read
    IProduktBatchDTO getProduktbatch(int produktbatchId) throws DALException;
    List<IProduktBatchDTO> getProduktbatchList() throws DALException;

    // Update
    void updateProduktbatch(IProduktBatchDTO produktbatch) throws DALException;

}
