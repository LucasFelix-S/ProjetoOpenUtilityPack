package br.com.lucas.openutilitypack.database.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaSqlServer {
    private String url;
    private String user;
    private String senha;

    public ConectaSqlServer(String url, String user, String senha) {
        this.url = url;
        this.user = user;
        this.senha = senha;
    }

    public Connection conexao() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexao no SQLServer realizada com sucesso.");
        } catch(SQLException e) {
            System.err.println("Erro na conexão com o Banco de Dados na classe 'ConectaSqlServer'= "
                    + e.getMessage());
        }
        return connection;
    }
}