package Commodity;

public interface ICommodityDTO {

    int getCommodityID();

    void setCommodityID(int commodityID);

    double getSumOfCommodity();

    void setSumOfCommodity(int sumOfCommodity);

    String getCommodityNames();

    void setCommodityNames(String commodityNames);

    int getReorder();

    void setReorder(int reorder);
}
