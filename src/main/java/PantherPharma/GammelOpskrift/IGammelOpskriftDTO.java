package PantherPharma.GammelOpskrift;

public interface IGammelOpskriftDTO {

    int getGammelOpskriftId();
    void setGammelOpskriftId(int gammelOpskriftId);

    int getOpskriftId();
    void setOpskriftId(int opskriftId);

    String getDato();
    void setDato(String dato);

    String getUdgave();
    void setUdgave(String udgave);

}
