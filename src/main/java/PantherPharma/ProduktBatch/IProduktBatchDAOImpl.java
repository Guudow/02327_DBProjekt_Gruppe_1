package PantherPharma.ProduktBatch;

import Exception.DALException;
import SQL.DatabaseSetup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IProduktBatchDAOImpl implements IProduktBatchDAO {

    @Override
    public void createProduktbatch(IProduktBatchDTO produktbatch) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO s185021.ProduktBatch VALUES (?,?,?,?);");
            preparedStatement.setInt(1, produktbatch.getProduktBatchId());
            preparedStatement.setInt(2, produktbatch.getProduktId());
            preparedStatement.setInt(3, produktbatch.getBrugerId());
            preparedStatement.setDouble(4, produktbatch.getVægt());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public IProduktBatchDTO getProduktbatch(int produktbatchId) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("SELECT * FROM s185032.ProduktBatch WHERE productBatchID = ?");
            preparedStatement.setInt(1, produktbatchId);
            ResultSet resultSet = preparedStatement.executeQuery();
            IProduktBatchDTO produktBatch = new IProduktBatchDTOImpl();
            resultSet.next();
            produktBatch.setProduktBatchId(resultSet.getInt(1));
            produktBatch.setProduktId(resultSet.getInt(2));
            produktBatch.setBrugerId(resultSet.getInt(3));
            produktBatch.setVægt(resultSet.getDouble(4));
            connection.commit();
            return produktBatch;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public List<IProduktBatchDTO> getProduktbatchList() throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("SELECT * FROM s185021.ProduktBatch");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<IProduktBatchDTO> iProduktBatchDTOList = new ArrayList<>();

            while (resultSet.next()) {
                IProduktBatchDTOImpl iProduktBatchDTO = new IProduktBatchDTOImpl();
                iProduktBatchDTO.setProduktBatchId(resultSet.getInt(1));
                iProduktBatchDTO.setProduktId(resultSet.getInt(2));
                iProduktBatchDTO.setBrugerId(resultSet.getInt(3));
                iProduktBatchDTO.setVægt(resultSet.getDouble(4));
                iProduktBatchDTOList.add(iProduktBatchDTO);
            }
            connection.commit();
            return iProduktBatchDTOList;
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }

    @Override
    public void updateProduktbatch(IProduktBatchDTO produktbatch) throws DALException {
        try (Connection connection = DatabaseSetup.createConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("UPDATE s185021.ProduktBatch SET produktID = ?, " +
                            "brugerID = ? vægt = ? WHERE produktBatchID = ?");
            preparedStatement.setInt(1, produktbatch.getProduktId());
            preparedStatement.setInt(2, produktbatch.getBrugerId());
            preparedStatement.setDouble(3, produktbatch.getVægt());
            preparedStatement.setInt(4, produktbatch.getProduktBatchId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }
}
