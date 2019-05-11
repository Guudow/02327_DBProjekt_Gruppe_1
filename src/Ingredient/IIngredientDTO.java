package Ingredient;

public interface IIngredientDTO {

    int getIngredientID();

    void setIngredientID(int ingredientID);

    int getBatchID();

    void setBatchID(int batchID);

    int getProducerID();

    void setProducerID(int producerID);

    String getExcipient();

    void setExcipient(String excipient);

    String getActiveSubstance();

    void setActiveSubstance(String activeSubstance);

    int getPercentageDeviation();

    void setPercentageDeviation(int percentageDeviation);
}
