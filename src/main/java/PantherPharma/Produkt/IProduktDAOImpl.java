package PantherPharma.Produkt;

import java.sql.Connection;
import java.util.List;
import Exception.DALException;
import SQL.DatabaseSetup;

public class IProduktDAOImpl implements IProduktDAO {

    @Override
    public void createProdukt(IProduktDTO produkt) throws DALException {

    }

    @Override
    public IProduktDTO getProdukt(int id) throws DALException {
        return null;
    }

    @Override
    public List<IProduktDTO> getProduktList() throws DALException {
        return null;
    }

    @Override
    public void updateProdukt(IProduktDTO produkt) throws DALException {

    }
}
