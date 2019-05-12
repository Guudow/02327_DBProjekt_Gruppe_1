package PantherPharma.Bruger;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IBrugerDAO {

    // Create
    void createBruger(IBrugerDTOImpl bruger, Connection connection) throws DALException;

    // Read
    IBrugerDTOImpl getBruger(int id, Connection connection) throws DALException;
    List<IBrugerDTOImpl> getBrugerList(Connection connection) throws DALException;

    // Update
    boolean updateBruger(IBrugerDTOImpl bruger, Connection connection) throws DALException;

    // Delete
    boolean deleteBruger(int id, Connection connection) throws DALException;

}
