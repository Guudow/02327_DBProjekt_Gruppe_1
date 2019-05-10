package DAL.DAO;

import DAL.DAO.Interface.IUserDAO;
import DAL.DTO.Interface.IUser;

import java.sql.Connection;
import java.util.List;

public class UserDAO implements IUserDAO {

    private Connection connection;

    public UserDAO(Connection connection) throws DALException{
        this.connection = connection;
    }

    @Override
    public void createUser(IUser userID, IUser user) throws DALException {


        if (userID.equals(user) && user.getRolesID().contains("admin")) {
            throw new DALException("roles contain admin");
        }



    }

    @Override
    public IUser getUser(int userID) throws DALException {
        return null;
    }

    @Override
    public List<IUser> getUserList() throws DALException {
        return null;
    }

    @Override
    public void updateUser(IUser user) throws DALException {

    }

    @Override
    public void deleteUser(int userId) throws DALException {

    }
}
