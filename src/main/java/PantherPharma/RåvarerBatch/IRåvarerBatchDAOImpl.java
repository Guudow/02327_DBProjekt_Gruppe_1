package PantherPharma.RåvarerBatch;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IRåvarerBatchDAOImpl implements IRåvarerBatchDAO {
    @Override
    public boolean createRåvareBatch(IRåvarerBatchDTOImpl råvarebatch, Connection con) throws DALException {
        return false;
    }

    @Override
    public IRåvarerBatchDTOImpl getRåvarebatch(int id, Connection con) throws DALException {
        return null;
    }

    @Override
    public List<IRåvarerBatchDTOImpl> getRåvarebatchList() throws DALException {
        return null;
    }

    @Override
    public boolean updateRåvarebatch(IRåvarerBatchDTOImpl råvarebatch, Connection con) throws DALException {
        return false;
    }

    @Override
    public boolean deleteRåvarebatch(int id, Connection con) throws DALException {
        return false;
    }
}
