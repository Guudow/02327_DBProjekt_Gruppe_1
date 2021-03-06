package PantherPharma.RåvarerBatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import PantherPharma.Exception.DALException;
import SQL.DatabaseSetup;

/**
 * @author s185021
 */
public class IRåvarerBatchDAOImpl implements IRåvarerBatchDAO {

    private Connection connection;

    @Override
    public void createRåvarerBatch(IRåvarerBatchDTO råvarerBatchDTO) throws DALException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO s185021.RåvarerBatch VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1, råvarerBatchDTO.getRåvarerBatchId());
            preparedStatement.setInt(2, råvarerBatchDTO.getProducentId());
            preparedStatement.setInt(3, råvarerBatchDTO.getRåvarerId());
            preparedStatement.setDouble(4, råvarerBatchDTO.getVægt());
            preparedStatement.setDouble(5, råvarerBatchDTO.getMinimumsMængde());
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public IRåvarerBatchDTO getRåvarerBatch(int CommodityBatchId) throws DALException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("SELECT * FROM s185021.RåvarerBatch WHERE råvarerBatchID = ?;" );
            preparedStatement.setInt(1,CommodityBatchId);
            ResultSet resultSet = preparedStatement.executeQuery();

            IRåvarerBatchDTO råvarerBatchDTO = new IRåvarerBatchDTOImpl();

            resultSet.next();
            råvarerBatchDTO.setRåvarerBatchId(resultSet.getInt(1));
            råvarerBatchDTO.setProducentId(resultSet.getInt(2));
            råvarerBatchDTO.setRåvarerId(resultSet.getInt(3));
            råvarerBatchDTO.setVægt(resultSet.getDouble(4));
            råvarerBatchDTO.setMinimumsMængde(resultSet.getDouble(5));
            connection.commit();
            connection.setAutoCommit(true);
            return råvarerBatchDTO;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public List<IRåvarerBatchDTO> getRåvarerBatchList() throws DALException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM s185021.RåvarerBatch");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<IRåvarerBatchDTO> iRåvarerBatchDTOList = new ArrayList<>();

            while (resultSet.next()) {
                IRåvarerBatchDTOImpl råvarerBatchDTO = new IRåvarerBatchDTOImpl();
                råvarerBatchDTO.setRåvarerBatchId(resultSet.getInt(1));
                råvarerBatchDTO.setProducentId(resultSet.getInt(2));
                råvarerBatchDTO.setRåvarerId(resultSet.getInt(3));
                råvarerBatchDTO.setVægt(resultSet.getDouble(4));
                råvarerBatchDTO.setMinimumsMængde(resultSet.getDouble(5));
                iRåvarerBatchDTOList.add(råvarerBatchDTO);
            }
            connection.commit();
            connection.setAutoCommit(true);
            return iRåvarerBatchDTOList;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public void updateRåvarerBatch(IRåvarerBatchDTO råvarerBatchDTO) throws DALException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE s185021.RåvarerBatch SET" +
                    "producentID = ?, råvarerID = ?, vægt = ?, minimumsMængde = ?  WHERE råvarerBatchID = ?");
            preparedStatement.setInt(1,råvarerBatchDTO.getProducentId());
            preparedStatement.setInt(2,råvarerBatchDTO.getRåvarerId());
            preparedStatement.setDouble(3,råvarerBatchDTO.getVægt());
            preparedStatement.setDouble(4,råvarerBatchDTO.getMinimumsMængde());
            preparedStatement.setInt(5,råvarerBatchDTO.getRåvarerBatchId());
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
    } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }
}
