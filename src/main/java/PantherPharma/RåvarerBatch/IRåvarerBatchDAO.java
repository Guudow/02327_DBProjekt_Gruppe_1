package PantherPharma.RåvarerBatch;

import Exception.DALException;

import java.util.List;

public interface IRåvarerBatchDAO {

    // Create
    void createRåvarerBatch(IRåvarerBatchDTO råvarerBatch) throws DALException;

    // Read
    IRåvarerBatchDTO getRåvarerBatch(int råvarerBatchId) throws DALException;

    List<IRåvarerBatchDTO> getRåvarerBatchList() throws DALException;

    // Update
    void updateRåvarerBatch(IRåvarerBatchDTO råvarerBatch) throws DALException;

}
