package DAL.DTO;

import DAL.DAO.Interface.IUserDAO;
import DAL.DAO.Interface.Interface.IUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable, IUser{


    private int userID;
    private int rolesID;
    private String userName;

    public User(int userID, int rolesID, String userName) {
        this.userID = userID;
        this.rolesID = rolesID;
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRolesID() {
        return rolesID;
    }

    public void setRolesID(int rolesID) {
        this.rolesID = rolesID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", rolesID=" + rolesID +
                ", userName='" + userName + '\'' +
                '}';
    }}


