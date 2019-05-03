package DAL.DTO;

public class Commodity implements ICommodity {

    private int commodityID;
    private double sumOfCommodity;
    private String commodityNames;
    private int reorder;

    public Commodity(int commodityID, int sumOfCommodity, String commodityNames, int reorder) {
        this.commodityID = commodityID;
        this.sumOfCommodity = sumOfCommodity;
        this.commodityNames = commodityNames;
        this.reorder = reorder;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public double getSumOfCommodity() {
        return sumOfCommodity;
    }

    public void setSumOfCommodity(int sumOfCommodity) {
        this.sumOfCommodity = sumOfCommodity;
    }

    public String getCommodityNames() {
        return commodityNames;
    }

    public void setCommodityNames(String commodityNames) {
        this.commodityNames = commodityNames;
    }

    public int getReorder() {
        return reorder;
    }

    public void setReorder(int reorder) {
        this.reorder = reorder;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityID=" + commodityID +
                ", sumOfCommodity=" + sumOfCommodity +
                ", commodityNames='" + commodityNames + '\'' +
                ", reorder=" + reorder +
                '}';
    }
}
