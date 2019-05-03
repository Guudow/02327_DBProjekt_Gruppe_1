package DAL.DTO;

import java.util.List;

public interface ICommodityBatch {

    int getBatchId();

    void setBatchId(int batchId);

    String getProducerName();

    void setProducerName(String producerName);

    int getIngredientID();

    void setIngredientID(int ingredientID);

    double getWeight();

    void setWeight(int weight);

    double getPercenttageDeviation();

    void setPercenttageDeviation(int percenttageDeviation);

    int getMinimumQuentity();

    void setMinimumQuentity(int minimumQuentity);

    List<String> getCommodityID();

    void setCommodityID(List<String> commodityID);
}
