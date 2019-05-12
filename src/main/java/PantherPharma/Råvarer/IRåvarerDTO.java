package PantherPharma.Råvarer;

public interface IRåvarerDTO {

    int getRåvarerId();
    void setRåvarerId(int råvarerId);

    int getIndholdsstofId();
    void setIndholdsstofId(int indholdsstofId);

    int getSumAfRåvarerBatches();
    void setSumAfRåvarerBatches(int sumAfRåvarerBatches);

    String getRåvarerNavn();
    void setRåvarerNavn(String råvarerNavn);

    boolean getGenbestilling();
    void setGenbestilling(boolean genbestilling);

}
