package br.com.lucas.openutilitypack.database.config;
import br.com.lucas.openutilitypack.database.connection.SqlServerConnection;
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

    public static void readingPropertiesFile() {
        try{
            String propertiesFile = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            DataBaseConfigPojo dataBaseConfigPojo = gson.fromJson(propertiesFile, DataBaseConfigPojo.class);
            SqlServerConnection sqlServerConnection = new SqlServerConnection(dataBaseConfigPojo);
            sqlServerConnection.dataBaseConnection();
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}