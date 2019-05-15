package PantherPharma.Bruger;

import PantherPharma.Exception.DALException;

import java.util.List;

public interface IBrugerDAO {

    // Create
    void createBruger(IBrugerDTO bruger) throws DALException;

    // Read
    IBrugerDTO getBruger(int id) throws DALException;

    List<IBrugerDTO> getBrugerList() throws DALException;

    // Update
    void updateBruger(IBrugerDTO bruger) throws DALException;

    // Delete
    void deleteBruger(int brugerID) throws DALException;

}
