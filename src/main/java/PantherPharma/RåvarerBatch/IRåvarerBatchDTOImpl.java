package PantherPharma.RåvarerBatch;

public class IRåvarerBatchDTOImpl implements IRåvarerBatchDTO {

    private int råvarerBatchId;
    private int producentId;
    private int råvarerId;
    private double vægt;
    private double minimumsMængde;

    @Override
    public int getRåvarerBatchId() {
        return råvarerBatchId;
    }

    @Override
    public void setRåvarerBatchId(int råvarerBatchId) {
        this.råvarerBatchId = råvarerBatchId;
    }

    @Override
    public int getProducentId() {
        return producentId;
    }

    @Override
    public void setProducentId(int producentId) {
        this.producentId = producentId;
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
    public double getVægt() {
        return vægt;
    }

    @Override
    public void setVægt(double vægt) {
        this.vægt = vægt;
    }

    @Override
    public double getMinimumsMængde() {
        return minimumsMængde;
    }

    @Override
    public void setMinimumsMængde(double minimumsMængde) {
        this.minimumsMængde = minimumsMængde;
    }

    @Override
    public String toString() {
        return "RåvarerBatchDTO{" + "RåvarerBatchId=" + råvarerBatchId + ", ProducentId=" + producentId + ", råvarerId=" + råvarerId
                + ", vægt=" + vægt + ", minimumsMængde" + minimumsMængde + '}';
    }
}
