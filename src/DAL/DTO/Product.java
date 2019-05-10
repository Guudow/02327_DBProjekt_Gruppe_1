package DAL.DTO;

import DAL.DAO.Interface.Interface.IProduct;

import java.util.List;

public class Product implements IProduct {



    private int productID;
    private int recipeID;
    private int productBatchID;
    private int userID;
    private int commodityID;
    private String productName;
    private List<String> productBatches;

    public Product(int productID, int recipeID, int productBatchID, int userID, int commodityID,
                   String productName, List<String> productBatches) {
        this.productID = productID;
        this.recipeID = recipeID;
        this.productBatchID = productBatchID;
        this.userID = userID;
        this.commodityID = commodityID;
        this.productName = productName;
        this.productBatches = productBatches;
    }

    @Override
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int getRecipeID() {
        return recipeID;
    }

    @Override
    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public int getProductBatchID() {
        return productBatchID;
    }

    public void setProductBatchID(int productBatchID) {
        this.productBatchID = productBatchID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public List<String> getProductBatches() {
        return productBatches;
    }

    @Override
    public void setProductBatches(List<String> productBatches) {
        this.productBatches = productBatches;
    }

    public boolean addProductBatches(String productBatches){
        return this.productBatches.add(productBatches);
    }

    public boolean removeProductBatches(){
        return this.productBatches.remove(productBatches);
    }


    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", recipeID=" + recipeID +
                ", productBatchID=" + productBatchID +
                ", userID=" + userID +
                ", commodityID=" + commodityID +
                ", productName='" + productName + '\'' +
                ", productBatches=" + productBatches +
                '}';
    }}