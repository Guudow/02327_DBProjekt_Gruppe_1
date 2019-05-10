package DAL.DAO;

import DAL.DTO.Product;
import DAL.DTO.Recipe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PantherPharma {

    public void createRecipe (Recipe recipe) throws DALException {
        try (Connection c = createConnection()) {
            PreparedStatement prep = c.prepareStatement("INSERT INTO Recipies (recipeID, ingredientID, " +
                    "userID, date, edition) " +
                    "VALUES (?, ?, ?, date , ?)");
            prep.setInt(1, recipe.getRecipeID());
            prep.setInt(2, recipe.getIngredientID());
            prep.setInt(3, recipe.getUserID());
            prep.setFloat(5, recipe.getEdition());
            prep.execute();

        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    public void createProduct (Product product) throws DALException {
        try (Connection c = createConnection()) {
            PreparedStatement prep = c.prepareStatement("INSERT INTO Products (productID, recipeID, " +
                    "productBatchID, userID, commodityID, productName) " +
                    "VALUES (?.?,?,?,?,?");
            prep.setInt(1, product.getProductID());
            prep.setInt(2, product.getRecipeID());
            prep.setInt(3, product.getProductBatchID());
            prep.setInt(4, product.getUserID());
            prep.setInt(5, product.getCommodityID());
            prep.setString(6, product.getProductName());
            prep.execute();

        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }


    private Connection createConnection() throws DALException{
        try {
            System.out.println("Connecting to a selected database...");
            return DriverManager.getConnection("jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com:3306/s164497?",
                    "s164497",
                    "Ukup0gpSceh8YVvNkjPad");
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        } }

    public class DALException extends Exception {
        //Til Java serialisering...
        private static final long serialVersionUID = 7355418246336739229L;

        public DALException(String msg, Throwable e) {
            super(msg,e);
        }

        public DALException(String msg) {
            super(msg);
        }

    }



}
