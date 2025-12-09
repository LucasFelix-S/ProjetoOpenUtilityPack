package br.com.lucas.openutilitypack.app;
import br.com.lucas.openutilitypack.database.config.DataBaseManager;

public class App {
    public static void main(String[] args) {
        DataBaseManager.connectionDataBase();
    }
}