package DAL.DAO.Interface;

import DAL.DTO.Interface.IUser;

import java.util.List;

public interface IUserDAO {

    //Create
    void createUser(IUser userID, IUser user) throws DALException;
    //Read
    IUser getUser(int userID) throws DALException;

    List<IUser> getUserList() throws DALException;
    //Update
    void updateUser(IUser user) throws DALException;
    //Delete
    void deleteUser(int userId) throws DALException;

    public class DALException extends Exception {
        //Til Java serialisering...
       // private static final long serialVersionUID = 7355418246336739229L;

        public DALException(String msg, Throwable e) {
            super(msg,e);
        }

        public DALException(String msg) {
            super(msg);
        }

    }

}