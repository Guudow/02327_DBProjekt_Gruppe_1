package PantherPharma.RåvarerBatch;

public interface IRåvarerBatchDTO {

    int getRåvarerBatchId();
    void setRåvarerBatchId(int råvarerBatchId);

    int getProducentId();
    void setProducentId(int producentId);

    int getRåvarerId();
    void setRåvarerId(int råvarerId);

    double getVægt();
    void setVægt(double vægt);

    double getMinimumsMængde();
    void setMinimumsMængde(double minimumsMængde);

}
