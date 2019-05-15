package PantherPharma.Råvarer;

import PantherPharma.Exception.DALException;

import java.util.List;

public interface IRåvarerDAO {

    // Create
    void createRåvare(IRåvarerDTO råvare) throws DALException;

    // Read
    IRåvarerDTO getRåvare(int råvareID) throws DALException;
    List<IRåvarerDTO> getRåvareList() throws DALException;

    // Update
    void updateRåvare(IRåvarerDTO råvare) throws DALException;


}
