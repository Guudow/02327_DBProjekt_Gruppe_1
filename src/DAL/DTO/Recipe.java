package DAL.DTO;

import DAL.DAO.Interface.Interface.IRecipe;

public class Recipe implements IRecipe {

    private int recipeID;
    private int ingredientID;
    private int userID;
    private String date;
    private float edition;



    public Recipe(int recipeID, int ingredientID, int userID, String date, float edition) {
        this.recipeID = recipeID;
        this.ingredientID = ingredientID;
        this.userID = userID;
        this.date = date;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public float getEdition() {
        return edition;
    }

    public void setEdition(float edition) {
        this.edition = edition;
    }



    @Override
    public String toString() {
        return "Recipe{" +
                "recipeID=" + recipeID +
                ", ingredientID=" + ingredientID +
                ", userID=" + userID +
                ", date=" + date +
                ", edition=" + edition +
                '}';
    }
}
