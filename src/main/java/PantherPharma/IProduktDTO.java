package PantherPharma;

public interface IProduktDTO {

    int getProduktId();
    void setProduktId(int produktId);

    int getRåvarerId();
    void setRåvarerId(int råvarerId);

    int getOpskriftId();
    void setOpskriftId(int opskriftId);

    int getRåvarerBatchId();
    void setRåvarerBatchId(int råvarerBatchId);

    int getBrugerId();
    void setBrugerId(int brugerId);

    String getProduktNavn();
    void  setProduktNavn(String produktNavn);



}
