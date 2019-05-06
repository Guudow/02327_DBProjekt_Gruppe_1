package DAL.DTO;

import DAL.DTO.Interface.IRecipe;

public class Recipe implements IRecipe {

    private int ingredientID;
    private String date;
    private int recipeID;
    private int edition;

    public Recipe(int ingredientID, String date, int recipeID, int edition) {
        this.ingredientID = ingredientID;
        this.date = date;
        this.recipeID = recipeID;
        this.edition = edition;

    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getDate(String date) {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }



    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }



    @Override
    public String toString() {
        return "Recipe{" +
                "ingredientID=" + ingredientID +
                ", date=" + date +
                ", recipeID=" + recipeID +
                ", edition=" + edition +
                '}';
    }
}
