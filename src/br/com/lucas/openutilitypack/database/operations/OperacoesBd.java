package br.com.lucas.openutilitypack.database.operations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacoesBd {
    public static void select(Connection conexao){
        try{
            String select = "SELECT * FROM tbProdutos;";
            Connection connection = conexao;
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            ResultSet resultadoConsulta = preparedStatement.executeQuery();
            while(resultadoConsulta.next()) {
                int codigo_produto = resultadoConsulta.getInt("codigo_produto");
                String descricao_produto = resultadoConsulta.getString("descricao_produto");
                String linha_produto = resultadoConsulta.getString("linha_produto");
                String status_prodito = resultadoConsulta.getString("status_produto");
                System.out.println("ID: " + codigo_produto + " descricao_produto: " + descricao_produto
                        + " linha_produto" + linha_produto + " status_prodito" + status_prodito);
            }
        } catch(SQLException e) {
            System.err.println("Erro na realização do SELECT na classe 'operacoesBd'= "
                    + e.getMessage());
        }
    }
}