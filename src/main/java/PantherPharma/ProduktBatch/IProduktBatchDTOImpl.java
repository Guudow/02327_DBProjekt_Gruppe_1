package PantherPharma.ProduktBatch;

public class IProduktBatchDTOImpl implements IProduktBatchDTO {

    private int produktBatchId;
    private int produktId;
    private int brugerId;
    private double vægt;

    @Override
    public int getProduktBatchId() {
        return produktBatchId;
    }

    @Override
    public void setProduktBatchId(int produktBatchId) {
        this.produktBatchId = produktBatchId;
    }

    @Override
    public int getProduktId() {
        return produktId;
    }

    @Override
    public void setProduktId(int produktId) {
        this.produktId = produktId;
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
    public double getVægt() {
        return vægt;
    }

    @Override
    public void setVægt(double vægt) {
        this.vægt = vægt;
    }
}
