package DAL.DTO;

import DAL.DTO.Interface.IUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable, IUser {

    private int userID;
    private String userName;
    private String ini;
    private List<String> rolesID; // RoleID can be the productmanager, Pharmacist & Laboratory

    private User(){
        this.rolesID = new ArrayList<>();
    }

    public User(int userID, String userName, String ini, List<String> rolesID) {
        this.userID = userID;
        this.userName = userName;
        this.ini = ini;
        this.rolesID = rolesID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIni() {
        return ini;
    }

    public void setIni(String ini) {
        this.ini = ini;
    }

    public List<String> getRolesID() {
        return rolesID;
    }

    public void setRolesID(List<String> rolesID) {
        this.rolesID = rolesID;
    }

    @Override
    public void addRolesID(String role) {
        this.rolesID.add(role);
    }

    @Override
    public boolean removeRolesID(String role) {
        return this.rolesID.remove(role);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", ini='" + ini + '\'' +
                ", rolesID=" + rolesID +
                '}';
    }
}
