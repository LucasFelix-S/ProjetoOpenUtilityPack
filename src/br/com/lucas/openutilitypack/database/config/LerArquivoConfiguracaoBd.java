package br.com.lucas.openutilitypack.database.config;
import br.com.lucas.openutilitypack.database.connection.SqlServerConnection;
import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LerArquivoConfiguracaoBd {
    public static void lendoArquivo() {
        try{
            String arquivo = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            PojoArquivoConfiguracaoBd pac = gson.fromJson(arquivo, PojoArquivoConfiguracaoBd.class);
            SqlServerConnection.conexao(pac.getUrl(), pac.getUser(), pac.getSenha());
        } catch(Exception e){
            System.err.println("Erro durante a leitura do arquivo de configuração na classe 'LerArquivoDeConfiguracaoBd'= "
                    + e.getMessage());
        }
    }
}