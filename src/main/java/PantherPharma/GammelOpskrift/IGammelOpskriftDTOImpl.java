package PantherPharma.GammelOpskrift;

public class IGammelOpskriftDTOImpl implements IGammelOpskriftDTO {

    private int gammelOpskriftId;
    private int opskriftId;
    private String dato;
    private String udgave;

    @Override
    public int getGammelOpskriftId() {
        return gammelOpskriftId;
    }

    @Override
    public void setGammelOpskriftId(int gammelOpskriftId) {
        this.gammelOpskriftId = gammelOpskriftId;
    }

    @Override
    public int getOpskriftId() {
        return opskriftId;
    }

    @Override
    public void setOpskriftId(int opskriftId) {
        this.opskriftId = opskriftId;
    }

    @Override
    public String getDato() {
        return dato;
    }

    @Override
    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String getUdgave() {
        return udgave;
    }

    @Override
    public void setUdgave(String udgave) {
        this.udgave = udgave;
    }
}
