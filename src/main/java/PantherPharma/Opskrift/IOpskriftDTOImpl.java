package PantherPharma.Opskrift;

public class IOpskriftDTOImpl implements IOpskriftDTO {

    private int opskriftId;
    private int indholdsstofId;
    private int brugerId;
    private String dato;
    private String udgave;

    @Override
    public int getOpskriftId() {
        return opskriftId;
    }

    @Override
    public void setOpskriftId(int opskriftId) {
        this.opskriftId = opskriftId;
    }

    @Override
    public int getIndholdsstofId() {
        return indholdsstofId;
    }

    @Override
    public void setIndholdsstofId(int indholdsstofId) {
        this.indholdsstofId = indholdsstofId;
    }

    @Override
    public int getBrugerId() {
        return brugerId;
    }

    @Override
    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
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
