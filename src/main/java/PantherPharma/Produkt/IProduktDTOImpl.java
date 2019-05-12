package PantherPharma.Produkt;

public class IProduktDTOImpl implements IProduktDTO {

    private int produktId;
    private int råvarerId;
    private int opskriftId;
    private int råvarerBatchId;
    private int brugerId;
    private String produktNavn;


    @Override
    public int getProduktId() {
        return produktId;
    }

    @Override
    public void setProduktId(int produktId) {
        this.produktId = produktId;

    }

    @Override
    public int getRåvarerId() {
        return råvarerId;
    }

    @Override
    public void setRåvarerId(int råvarerId) {
        this.råvarerId = råvarerId;
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
    public int getRåvarerBatchId() {
        return råvarerBatchId;
    }

    @Override
    public void setRåvarerBatchId(int råvarerBatchId) {
        this.råvarerBatchId = råvarerBatchId;
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
    public String getProduktNavn() {
        return produktNavn;
    }

    @Override
    public void setProduktNavn(String produktNavn) {
        this.produktNavn = produktNavn;
    }

    @Override
    public String toString() {
        return "{" + " råvarerBatchId='" + råvarerBatchId + "'" + ", produktId='" + produktId + "'"
                + ", brugerId='" + brugerId + "'" + ", opskriftId='" + opskriftId +
                "'" + ", produktNavn='" + produktNavn + "'" + ",råvarerId " + råvarerId + " }";
    }
}
