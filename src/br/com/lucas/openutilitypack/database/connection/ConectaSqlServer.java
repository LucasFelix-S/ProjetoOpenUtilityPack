package br.com.lucas.openutilitypack.database.connection;
import br.com.lucas.openutilitypack.database.operations.OperacoesBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaSqlServer {
    public static Connection conexao(String url, String user, String senha) {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexao no SQLServer realizada com sucesso.");
            OperacoesBd.select(connection);
        } catch(SQLException e) {
            System.err.println("Erro na conexão com o Banco de Dados na classe 'ConectaSqlServer'= "
                    + e.getMessage());
        }
        return connection;
    }
}