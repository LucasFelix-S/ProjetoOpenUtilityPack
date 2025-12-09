package br.com.lucas.openutilitypack.database.operations;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class DataBaseOperations {
    public abstract void selectOperation(Connection connection, String selectQuery) throws SQLException;
    public abstract void insertOperation(Connection connection, String insertQuery) throws SQLException;
    public abstract void deleteOperation(Connection connection, String deleteQuery) throws SQLException;
}