package PantherPharma.Opskrift;

import java.sql.Connection;
import java.util.List;
import PantherPharma.Exception.DALException;


public interface IOpskriftDAO {

    // Create
    void createOpskrift(IOpskriftDTO opskrift) throws DALException;

    // Read
    IOpskriftDTO getOpskrift(int id) throws DALException;
    List<IOpskriftDTO> getOpskriftList() throws DALException;

    // Update
    void updateOpskrift(IOpskriftDTO opskrift, Connection connection) throws DALException;

    // Delete
    void deleteOpskrift(int id) throws DALException;

}
