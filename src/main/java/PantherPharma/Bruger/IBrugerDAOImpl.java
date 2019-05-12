package PantherPharma.Bruger;

import java.sql.*;
import java.util.List;
import Exception.DALException;
import SQL.DatabaseSetup;

public class IBrugerDAOImpl implements IBrugerDAO {

    @Override
    public void createBruger(IBrugerDTO bruger) throws DALException {

    }

    @Override
    public IBrugerDTO getBruger(int id) throws DALException {
        return null;
    }

    @Override
    public List<IBrugerDTO> getBrugerList() throws DALException {
        return null;
    }

    @Override
    public void updateBruger(IBrugerDTO bruger) throws DALException {

    }

    @Override
    public void deleteBruger(int brugerID) throws DALException {

    }
}
