package PantherPharma.Opskrift;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;


public interface IOpskriftDAO {

    // Create
    void createOpskrift(IOpskriftDTOImpl opskrift, Connection connection) throws DALException;

    // Read
    IOpskriftDTOImpl getOpskrift(int id, Connection connection) throws DALException;
    List<IOpskriftDTOImpl> getOpskriftList(Connection connection) throws DALException;

    // Update
    boolean updateOpskrift(IOpskriftDTOImpl opskrift, Connection connection) throws DALException;

    // Delete
    boolean deleteOpskrift(int id, Connection connection) throws DALException;


}
