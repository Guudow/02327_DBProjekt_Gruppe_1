package PantherPharma.Produkt;

import PantherPharma.Exception.DALException;

import java.util.List;

public interface IProduktDAO {

    // Create
    void createProdukt(IProduktDTO produkt) throws DALException;

    // Read
    IProduktDTO getProdukt(int id) throws DALException;
    List<IProduktDTO> getProduktList() throws DALException;

    // Update
    void updateProdukt(IProduktDTO produkt) throws DALException;


}
