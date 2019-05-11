package Product;

import java.util.List;

public interface IProductDTO {

    String getProductID();

    void setProductID(String productID);

    int getRecipeID();


    void setRecipeID(int recipeID);

    double getQuentity();

    void setQuentity(int quentity);

    List<String> getProductBatches();

    void setProductBatches(List<String> productBatches);

    boolean addProductBatches(String productBatches);

    boolean removeProductBatches();





}