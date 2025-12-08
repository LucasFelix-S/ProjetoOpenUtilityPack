package br.com.lucas.openutilitypack.database.config;
import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    public static void creatingPropertiesFile(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("properties.json"))) {
            bw.write("{\n" +
                    "    \"DataBaseUrl\": \"\",\n" +
                    "    \"DataBaseUser\": \"\",\n" +
                    "    \"DataBasePassword\": \"\"\n" +
                    "}");
            bw.flush();
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Connection connectionDataBase() {
        Connection connection = null;
        try{
            //=======================
            //Reading properties file
            //=======================
            String propertiesFile = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            DataBaseConfigPojo dbPojo = gson.fromJson(propertiesFile, DataBaseConfigPojo.class);

            //==========================
            //Connecting to the database
            //==========================
            connection = DriverManager.getConnection(dbPojo.getDataBaseUrl(),
                                                                dbPojo.getDataBaseUser(),
                                                                dbPojo.getDataBasePassword());
            System.out.println("Connection made successfully");
            return connection;
        } catch(SQLException | IOException e) {
            System.err.println("Error connecting to the database, " + e.getMessage());
        }
        return connection;
    }
}