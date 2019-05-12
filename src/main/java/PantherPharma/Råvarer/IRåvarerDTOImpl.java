package PantherPharma.Råvarer;

public class IRåvarerDTOImpl implements IRåvarerDTO {

    private int råvarerId;
    private int indholdsstofId;
    private int sumAfRåvarerBatches;
    private String råvarerNavn;
    private boolean genbestilling;


    @Override
    public int getRåvarerId() {
        return råvarerId;
    }

    @Override
    public void setRåvarerId(int råvarerId) {
        this.råvarerId = råvarerId;
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
    public int getSumAfRåvarerBatches() {
        return sumAfRåvarerBatches;
    }

    @Override
    public void setSumAfRåvarerBatches(int sumAfRåvarerBatches) {
        this.sumAfRåvarerBatches = sumAfRåvarerBatches;
    }

    @Override
    public String getRåvarerNavn() {
        return råvarerNavn;
    }

    @Override
    public void setRåvarerNavn(String råvarerNavn) {
        this.råvarerNavn = råvarerNavn;
    }

    @Override
    public boolean getGenbestilling() {
        return genbestilling;
    }

    @Override
    public void setGenbestilling(boolean genbestilling) {
        this.genbestilling = genbestilling;
    }

    @Override
    public String toString() {
        return "RåvarerDTO [råvarerId=" + råvarerId + ", råvarerNavn=" + råvarerNavn + ", " +
                "indholdsstofId=" + indholdsstofId + ", sumAfRåvarerBatches=" + sumAfRåvarerBatches + ", " +
                "genbestilling=" + genbestilling + "]";
    }
}
