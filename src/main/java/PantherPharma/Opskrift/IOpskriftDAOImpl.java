package PantherPharma.Opskrift;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IOpskriftDAOImpl implements IOpskriftDAO {

    @Override
    public void createOpskrift(IOpskriftDTO opskrift) throws DALException {

    }

    @Override
    public IOpskriftDTO getOpskrift(int id) throws DALException {
        return null;
    }

    @Override
    public List<IOpskriftDTO> getOpskriftList() throws DALException {
        return null;
    }

    @Override
    public void updateOpskrift(IOpskriftDTO opskrift, Connection connection) throws DALException {

    }

    @Override
    public void deleteOpskrift(int id) throws DALException {

    }
}
