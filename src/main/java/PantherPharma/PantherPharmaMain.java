package PantherPharma;

import PantherPharma.ProduktBatch.IProduktBatchDTOImpl;
import PantherPharma.RåvarerBatch.IRåvarerBatchDTOImpl;

import java.sql.Date;

public class PantherPharmaMain {

    public static void main(String[] args) {
        IProduktBatchDTOImpl produkt = new IProduktBatchDTOImpl();


        IRåvarerBatchDTOImpl råvarerBatch = new IRåvarerBatchDTOImpl();
        råvarerBatch.setRåvarerId(4);
        råvarerBatch.setProducentId(3);
        råvarerBatch.setRåvarerBatchId(1);
        råvarerBatch.setMinimumsMængde(10.2);
        råvarerBatch.setVægt(20.5);


    }
}
