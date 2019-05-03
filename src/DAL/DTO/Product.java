package DAL.DTO;

import java.util.List;

public class Product implements IProduct {

    private String productID;
    private int RecipeID;
    private double quentity;
    private List<String> productBatches;

    public Product(String productID, int recipeID, double quentity, List<String> productBatches) {
        this.productID = productID;
        RecipeID = recipeID;
        this.quentity = quentity;
        this.productBatches = productBatches;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getRecipeID() {
        return RecipeID;
    }

    public void setRecipeID(int recipeID) {
        RecipeID = recipeID;
    }

    public double getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public List<String> getProductBatches() {
        return productBatches;
    }

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
                "productID='" + productID + '\'' +
                ", RecipeID=" + RecipeID +
                ", quentity=" + quentity +
                ", productBatches=" + productBatches +
                '}';
    }
}
