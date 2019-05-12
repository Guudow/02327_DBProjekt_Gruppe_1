package PantherPharma.Produkt;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;

public class IProduktDAOImpl implements IProduktDAO {
    @Override
    public void createProdukt(IProduktDTOImpl produkt, Connection connection) throws DALException {

    }

    @Override
    public IProduktDTOImpl getProdukt(int id, Connection connection) throws DALException {
        return null;
    }

    @Override
    public List<IProduktDTOImpl> getProduktList(Connection connection) throws DALException {
        return null;
    }

    @Override
    public boolean updateProdukt(IProduktDTOImpl produkt, Connection connection) throws DALException {
        return false;
    }

    @Override
    public boolean deleteProdukt(int id, Connection connection) throws DALException {
        return false;
    }
}
