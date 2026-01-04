package br.com.lucas.openutilitypack.database;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseConnection {
    public Connection connection() {
        Connection connection = null;
        try {
            InputStream inputStream = DataBaseConnection.class
                    .getClassLoader()
                    .getResourceAsStream("database.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String senha = properties.getProperty("db.password");

            connection = DriverManager.getConnection(url, user, senha);
            System.out.println("Connection made successfully");

            return connection;
        } catch (Exception e) {
            System.err.println("Error connecting to the database -> "  + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }
}