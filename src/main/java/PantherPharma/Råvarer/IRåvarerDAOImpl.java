package PantherPharma.Råvarer;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IRåvarerDAOImpl implements IRåvarerDAO {
    @Override
    public void createRåvare(IRåvarerDTOImpl råvare, Connection connection) throws DALException {

    }

    @Override
    public IRåvarerDTOImpl getRåvare(int id, Connection connection) throws DALException {
        return null;
    }

    @Override
    public List<IRåvarerDTOImpl> getRåvareList(Connection connection) throws DALException {
        return null;
    }

    @Override
    public boolean updateRåvare(IRåvarerDTOImpl råvare, Connection connection) throws DALException {
        return false;
    }

    @Override
    public boolean deleteRåvare(int id, Connection connection) throws DALException {
        return false;
    }
}
