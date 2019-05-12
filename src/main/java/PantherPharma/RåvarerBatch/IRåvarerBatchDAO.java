package PantherPharma.RåvarerBatch;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IRåvarerBatchDAO {

    // Create
    boolean createRåvareBatch(IRåvarerBatchDTOImpl råvarebatch, Connection con) throws DALException;

    // Read
    IRåvarerBatchDTOImpl getRåvarebatch(int id, Connection con) throws DALException;

    List<IRåvarerBatchDTOImpl> getRåvarebatchList() throws DALException;

    // Update
    boolean updateRåvarebatch(IRåvarerBatchDTOImpl råvarebatch, Connection con) throws DALException;

    // Delete
    boolean deleteRåvarebatch(int id, Connection con) throws DALException;

}
