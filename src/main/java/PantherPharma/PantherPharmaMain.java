package PantherPharma;

import PantherPharma.Exception.DALException;
import PantherPharma.ProduktBatch.IProduktBatchDTOImpl;
import PantherPharma.Råvarer.IRåvarerDAO;
import PantherPharma.Råvarer.IRåvarerDAOImpl;
import PantherPharma.Råvarer.IRåvarerDTO;
import PantherPharma.RåvarerBatch.IRåvarerBatchDAOImpl;
import PantherPharma.RåvarerBatch.IRåvarerBatchDTOImpl;



public class PantherPharmaMain {

    public static void main(String[] args) throws DALException {
        IProduktBatchDTOImpl produkt = new IProduktBatchDTOImpl();



        IRåvarerBatchDTOImpl råvarerBatch = new IRåvarerBatchDTOImpl();
        IRåvarerBatchDAOImpl råvarerBatchDAO = new IRåvarerBatchDAOImpl();
        råvarerBatch.setRåvarerId(4);
        råvarerBatch.setProducentId(3);
        råvarerBatch.setRåvarerBatchId(1);
        råvarerBatch.setMinimumsMængde(10.2);
        råvarerBatch.setVægt(20.5);

        råvarerBatchDAO.createRåvarerBatch(råvarerBatch);

    }
}
