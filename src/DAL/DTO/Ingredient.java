package DAL.DTO;

import DAL.DTO.Interface.IIngredient;

public class Ingredient implements IIngredient {

    private int ingredientID;
    private int batchID;
    private int producerID;
    private String excipient;
    private String activeSubstance;
    private int percentageDeviation;

    public Ingredient(int ingredientID, int batchID,
                      int producerID, String excipient, String activeSubstance,
                      int percentageDeviation) {
        this.ingredientID = ingredientID;
        this.batchID = batchID;
        this.producerID = producerID;
        this.excipient = excipient;
        this.activeSubstance = activeSubstance;
        this.percentageDeviation = percentageDeviation;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public int getProducerID() {
        return producerID;
    }

    public void setProducerID(int producerID) {
        this.producerID = producerID;
    }

    public String getExcipient() {
        return excipient;
    }

    public void setExcipient(String excipient) {
        this.excipient = excipient;
    }

    public String getActiveSubstance() {
        return activeSubstance;
    }

    public void setActiveSubstance(String activeSubstance) {
        this.activeSubstance = activeSubstance;
    }

    public int getPercentageDeviation() {
        return percentageDeviation;
    }

    public void setPercentageDeviation(int percentageDeviation) {
        this.percentageDeviation = percentageDeviation;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientID=" + ingredientID +
                ", batchID=" + batchID +
                ", producerID=" + producerID +
                ", excipient='" + excipient + '\'' +
                ", activeSubstance='" + activeSubstance + '\'' +
                ", percentageDeviation=" + percentageDeviation +
                '}';
    }
}