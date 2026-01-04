package br.com.lucas.openutilitypack.database;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateDataBaseProperties {
    public static void creatingDataBaseProperties() {
        try {
            Properties properties = new Properties();
            properties.setProperty("db.url", "jdbc:sqlserver://<host>:<port>[;<property>=<value>]");
            properties.setProperty("db.user", "user");
            properties.setProperty("db.password", "password");

            String resourcesDirectory = System.getProperty("user.dir") + "\\resources";
            File file = new File(resourcesDirectory);

            if(!file.exists()) {
                file.mkdir();
            }

            String filePath = resourcesDirectory + "\\database.properties";
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            properties.store(fileOutputStream, null);
            fileOutputStream.close();

            System.out.println(".properties file created successfully!");
        } catch (IOException e) {
            System.err.println("Error during the creation of the .properties file. -> " + e.getMessage());
            e.printStackTrace();
        }
    }
}