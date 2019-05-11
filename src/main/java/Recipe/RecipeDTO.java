package Recipe;

import Recipe.IRecipeDTO;

public class RecipeDTO implements IRecipeDTO {

    private int ingredientID;
    private String date;
    private int recipeID;
    private int edition;

    public RecipeDTO(int ingredientID, String date, int recipeID, int edition) {
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
        return "RecipeDTO{" +
                "ingredientID=" + ingredientID +
                ", date=" + date +
                ", recipeID=" + recipeID +
                ", edition=" + edition +
                '}';
    }
}
