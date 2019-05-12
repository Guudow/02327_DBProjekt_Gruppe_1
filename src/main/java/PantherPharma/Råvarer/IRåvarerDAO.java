package PantherPharma.Råvarer;

import java.sql.Connection;
import java.util.List;

import Exception.DALException;

public interface IRåvarerDAO {

    // Create
    void createRåvare(IRåvarerDTOImpl råvare, Connection connection) throws DALException;

    // Read
    IRåvarerDTOImpl getRåvare(int id, Connection connection) throws DALException;
    List<IRåvarerDTOImpl> getRåvareList(Connection connection) throws DALException;

    // Update
    boolean updateRåvare(IRåvarerDTOImpl råvare, Connection connection) throws DALException;

    // Delete
    boolean deleteRåvare(int id, Connection connection) throws DALException;

}
