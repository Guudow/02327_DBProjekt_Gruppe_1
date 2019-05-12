package PantherPharma.Opskrift;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IOpskriftDAOImpl implements IOpskriftDAO {
    @Override
    public void createOpskrift(IOpskriftDTOImpl opskrift, Connection connection) throws DALException {

    }

    @Override
    public IOpskriftDTOImpl getOpskrift(int id, Connection connection) throws DALException {
        return null;
    }

    @Override
    public List<IOpskriftDTOImpl> getOpskriftList(Connection connection) throws DALException {
        return null;
    }

    @Override
    public boolean updateOpskrift(IOpskriftDTOImpl opskrift, Connection connection) throws DALException {
        return false;
    }

    @Override
    public boolean deleteOpskrift(int id, Connection connection) throws DALException {
        return false;
    }
}
