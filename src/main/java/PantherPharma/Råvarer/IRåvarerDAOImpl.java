package PantherPharma.Råvarer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import PantherPharma.Exception.DALException;
import SQL.DatabaseSetup;

public class IRåvarerDAOImpl implements IRåvarerDAO {

    @Override
    public void createRåvare(IRåvarerDTO råvare) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO s185021.Råvarer VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1, råvare.getRåvarerId());
            preparedStatement.setInt(2, råvare.getIndholdsstofId());
            preparedStatement.setInt(3, råvare.getSumAfRåvarerBatches());
            preparedStatement.setString(4, råvare.getRåvarerNavn());
            preparedStatement.setBoolean(5, råvare.getGenbestilling());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public IRåvarerDTO getRåvare(int råvareID) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()){
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("SELECT * FROM s185021.Råvarer WHERE råvarerID = ?;" );
            preparedStatement.setInt(1,råvareID);
            ResultSet resultSet = preparedStatement.executeQuery();

            IRåvarerDTO råvarerDTO = new IRåvarerDTOImpl();

            resultSet.next();
            råvarerDTO.setRåvarerId(resultSet.getInt(1));
            råvarerDTO.setIndholdsstofId(resultSet.getInt(2));
            råvarerDTO.setSumAfRåvarerBatches(resultSet.getInt(3));
            råvarerDTO.setRåvarerNavn(resultSet.getString(4));
            råvarerDTO.setGenbestilling(resultSet.getBoolean(5));
            connection.commit();
            return råvarerDTO;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public List<IRåvarerDTO> getRåvareList() throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()){
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM s185021.Råvarer");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<IRåvarerDTO> iRåvarerDTOList = new ArrayList<>();

            while (resultSet.next()) {
                IRåvarerDTOImpl råvarerDTO = new IRåvarerDTOImpl();
                råvarerDTO.setRåvarerId(resultSet.getInt(1));
                råvarerDTO.setIndholdsstofId(resultSet.getInt(2));
                råvarerDTO.setSumAfRåvarerBatches(resultSet.getInt(3));
                råvarerDTO.setRåvarerNavn(resultSet.getString(4));
                råvarerDTO.setGenbestilling(resultSet.getBoolean(5));
                iRåvarerDTOList.add(råvarerDTO);
            }
            connection.commit();
            return iRåvarerDTOList;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public void updateRåvare(IRåvarerDTO råvare) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE s185021.Råvarer SET" +
                    "indholdsstofID = ?, sumAfRåvarerBatches = ?, råvarerNavn = ?, genbestilling = ?  WHERE råvarerID = ?");
            preparedStatement.setInt(1, råvare.getIndholdsstofId());
            preparedStatement.setInt(2, råvare.getSumAfRåvarerBatches());
            preparedStatement.setString(3, råvare.getRåvarerNavn());
            preparedStatement.setBoolean(4, råvare.getGenbestilling());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }
}
