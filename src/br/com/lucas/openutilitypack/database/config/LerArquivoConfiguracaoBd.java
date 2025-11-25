package br.com.lucas.openutilitypack.database.config;
import br.com.lucas.openutilitypack.database.connection.ConectaSqlServer;
import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LerArquivoConfiguracaoBd {
    public static void lendoArquivo() {
        try{
            String arquivo = Files.readString(Paths.get("config.json"));

            Gson gson = new Gson();
            PojoArquivoConfiguracaoBd pac = gson.fromJson(arquivo, PojoArquivoConfiguracaoBd.class);

            ConectaSqlServer css = new ConectaSqlServer(pac.getUrl(), pac.getUser(), pac.getSenha());
            css.conexao();
        } catch(Exception e){
            System.err.println("Erro durante a leitura do arquivo de configuração na classe 'LerArquivoDeConfiguracaoBd'= "
                    + e.getMessage());
        }
    }
}