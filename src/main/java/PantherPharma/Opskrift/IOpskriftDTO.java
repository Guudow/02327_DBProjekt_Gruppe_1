package PantherPharma.Opskrift;

public interface IOpskriftDTO {

    int getOpskriftId();
    void setOpskriftId(int opskriftId);

    int getIndholdsstofId();
    void setIndholdsstofId(int indholdsstofId);

    int getBrugerId();
    void setBrugerId(int brugerId);

    String getDato();
    void setDato(String dato);

    String getUdgave();
    void setUdgave(String udgave);

}
