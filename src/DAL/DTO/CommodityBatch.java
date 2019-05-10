package DAL.DTO;

import DAL.DAO.Interface.Interface.ICommodityBatch;

import java.util.List;

public class CommodityBatch implements ICommodityBatch {

    private int batchId;
    private String producerName;
    private int ingredientID;
    private double weight;
    private double percenttageDeviation;
    private int minimumQuentity;
    private List<String> commodityID;

    public CommodityBatch(int batchId, String producerName, int ingredientID,
                          double weight, double percenttageDeviation, int minimumQuentity, List<String> commodityID) {

        this.batchId = batchId;
        this.producerName = producerName;
        this.ingredientID = ingredientID;
        this.weight = weight;
        this.percenttageDeviation = percenttageDeviation;
        this.minimumQuentity = minimumQuentity;
        this.commodityID = commodityID;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPercenttageDeviation() {
        return percenttageDeviation;
    }

    public void setPercenttageDeviation(int percenttageDeviation) {
        this.percenttageDeviation = percenttageDeviation;
    }

    public int getMinimumQuentity() {
        return minimumQuentity;
    }

    public void setMinimumQuentity(int minimumQuentity) {
        this.minimumQuentity = minimumQuentity;
    }

    public List<String> getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(List<String> commodityID) {
        this.commodityID = commodityID;
    }

    @Override
    public String toString() {
        return "CommodityBatch{" +
                "batchId=" + batchId +
                ", producerName='" + producerName + '\'' +
                ", ingredientID=" + ingredientID +
                ", weight=" + weight +
                ", percenttageDeviation=" + percenttageDeviation +
                ", minimumQuentity=" + minimumQuentity +
                ", commodityID=" + commodityID +
                '}';
    }
}
