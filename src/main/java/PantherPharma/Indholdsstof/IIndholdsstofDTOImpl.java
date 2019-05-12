package PantherPharma.Indholdsstof;

public class IIndholdsstofDTOImpl implements IIndholdsstofDTO {

    private int indholdsstofId;
    private int råvarerId;
    private int brugerId;
    private String hjælpeStof;
    private String aktivtStof;
    private double procentuelAfvigelse;


    @Override
    public int getIndholdsstofId() {
        return indholdsstofId;
    }

    @Override
    public void setIndholdsstofId(int indholdsstofId) {
        this.indholdsstofId = indholdsstofId;
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
    public int getBrugerId() {
        return brugerId;
    }

    @Override
    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
    }

    @Override
    public String getHjælpeStof() {
        return hjælpeStof;
    }

    @Override
    public void setHjælpeStof(String hjælpeStof) {
        this.hjælpeStof = hjælpeStof;
    }

    @Override
    public String getAktivtStof() {
        return aktivtStof;
    }

    @Override
    public void setAktivtStof(String aktivtStof) {
        this.aktivtStof = aktivtStof;
    }

    @Override
    public double getProcentuelAfvigelse() {
        return procentuelAfvigelse;
    }

    @Override
    public void setProcentuelAfvigelse(double procentuelAfvigelse) {
        this.procentuelAfvigelse = procentuelAfvigelse;
    }
}
