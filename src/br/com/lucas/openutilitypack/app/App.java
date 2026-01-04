package br.com.lucas.openutilitypack.app;

import br.com.lucas.openutilitypack.database.DataBaseConnection;

public class App {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        dataBaseConnection.connection();
    }
}