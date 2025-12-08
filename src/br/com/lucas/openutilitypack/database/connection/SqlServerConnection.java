package br.com.lucas.openutilitypack.database.connection;
import br.com.lucas.openutilitypack.database.config.DataBaseConfigPojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnection {
    String dataBaseUrl;
    String dataBaseUser;
    String dataBasePassword;

    public SqlServerConnection(DataBaseConfigPojo dataBaseConfigPojo) {
        this.dataBaseUrl = dataBaseConfigPojo.getDataBaseUrl();
        this.dataBaseUser = dataBaseConfigPojo.getDataBaseUser();
        this.dataBasePassword = dataBaseConfigPojo.getDataBasePassword();
    }

    public Connection dataBaseConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(dataBaseUrl, dataBaseUser, dataBasePassword);
            System.out.println("Connection made successfully");
        } catch(SQLException e) {
            System.err.println("Error connecting to the database "
                    + e.getMessage());
        }
        return connection;
    }
}