package DAL.DTO;

import DAL.DAO.Interface.Interface.IOldRecipe;

public class OldRecipe implements IOldRecipe {

    private int oldRecipeID;
    private int date;
    private int edition;
    private int replace;
    private int currentRecipe;

    public OldRecipe(int oldRecipeID, int date, int edition, int replace, int currentRecipe) {
        this.oldRecipeID = oldRecipeID;
        this.date = date;
        this.edition = edition;
        this.replace = replace;
        this.currentRecipe = currentRecipe;
    }

    public int getOldRecipeID() {
        return oldRecipeID;
    }

    public void setOldRecipeID(int oldRecipeID) {
        this.oldRecipeID = oldRecipeID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getReplace() {
        return replace;
    }

    public void setReplace(int replace) {
        this.replace = replace;
    }

    public int getCurrentRecipe() {
        return currentRecipe;
    }

    public void setCurrentRecipe(int currentRecipe) {
        this.currentRecipe = currentRecipe;
    }

    @Override
    public String toString() {
        return "OldRecipe{" +
                "oldRecipeID=" + oldRecipeID +
                ", date=" + date +
                ", edition=" + edition +
                ", replace=" + replace +
                ", currentRecipe=" + currentRecipe +
                '}';
    }
}
