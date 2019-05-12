package PantherPharma.ProduktBatch;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IProduktBatchDAOImpl implements IProduktBatchDAO {
    @Override
    public void createProduktbatch(IProduktBatchDTOImpl produktbatch, Connection connection) throws DALException {

    }

    @Override
    public IProduktBatchDTOImpl getProduktbatch(int id, Connection connection) throws DALException {
        return null;
    }

    @Override
    public List<IProduktBatchDTOImpl> getProduktbatchList(Connection connection) throws DALException {
        return null;
    }

    @Override
    public boolean updateProduktbatch(IProduktBatchDTOImpl produktbatch, Connection connection) throws DALException {
        return false;
    }

    @Override
    public boolean deleteProduktbatch(int id, Connection connection) throws DALException {
        return false;
    }
}
