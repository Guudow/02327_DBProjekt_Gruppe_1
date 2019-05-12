package PantherPharma.Indholdsstof;

public interface IIndholdsstofDTO {

    int getIndholdsstofId();
    void setIndholdsstofId(int indholdsstofId);

    int getRåvarerId();
    void setRåvarerId(int råvarerId);

    int getBrugerId();
    void setBrugerId(int brugerId);

    String getHjælpeStof();
    void setHjælpeStof(String hjælpeStof);

    String getAktivtStof();
    void setAktivtStof(String aktivtStof);

    double getProcentuelAfvigelse();
    void setProcentuelAfvigelse(double procentuelAfvigelse);

}
