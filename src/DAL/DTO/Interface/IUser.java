package DAL.DTO.Interface;

import java.util.List;

public interface IUser {

    int getUserID();

    void setUserID(int userID);

    String getUserName();

    void setUserName(String userName);

    String getIni();

    void setIni(String ini);

    List<String> getRolesID();

    void setRolesID(List<String> roles);

    void addRolesID(String role);

    boolean removeRolesID(String role);
}


