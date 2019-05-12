package PantherPharma.Bruger;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IBrugerDAOImpl implements IBrugerDAO {

    @Override
    public void createBruger(IBrugerDTOImpl bruger, Connection connection) throws DALException {

    }

    @Override
    public IBrugerDTOImpl getBruger(int id, Connection connection) throws DALException {
        return null;
    }

    @Override
    public List<IBrugerDTOImpl> getBrugerList(Connection connection) throws DALException {
        return null;
    }

    @Override
    public boolean updateBruger(IBrugerDTOImpl bruger, Connection connection) throws DALException {
        return false;
    }

    @Override
    public boolean deleteBruger(int id, Connection connection) throws DALException {
        return false;
    }
}
