package User;

import User.IUserDTO;
import User.IUserDAO;

import java.sql.Connection;
import java.util.List;

public class UserDAO implements IUserDAO {

    private Connection connection;

    public UserDAO(Connection connection) throws DALException{
        this.connection = connection;
    }

    @Override
    public void createUser(IUserDTO userID, IUserDTO user) throws DALException {


        if (userID.equals(user) && user.getRolesID().contains("admin")) {
            throw new DALException("roles contain admin");
        }



    }

    @Override
    public IUserDTO getUser(int userID) throws DALException {
        return null;
    }

    @Override
    public List<IUserDTO> getUserList() throws DALException {
        return null;
    }

    @Override
    public void updateUser(IUserDTO user) throws DALException {

    }

    @Override
    public void deleteUser(int userId) throws DALException {

    }
}
