package PantherPharma.ProduktBatch;

public interface IProduktBatchDTO {

    int getProduktBatchId();
    void setProduktBatchId(int produktBatchId);

    int getProduktId();
    void setProduktId(int produktId);

    int getBrugerId();
    void setBrugerId(int brugerId);

    double getVægt();
    void setVægt(double vægt);

}
