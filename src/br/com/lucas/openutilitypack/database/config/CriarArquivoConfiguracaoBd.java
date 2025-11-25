package br.com.lucas.openutilitypack.database.config;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CriarArquivoConfiguracaoBd {
    public static void arquivoConfiguracaoBd() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("config.json"));
            bw.write("{\n" +
                    "    \"url\": \"\",\n" +
                    "    \"user\": \"\",\n" +
                    "    \"senha\": \"\"\n" +
                    "}");
            bw.flush();
        } catch(Exception e) {
            System.err.println("Erro durante a criação do arquivo 'config.json' na classe 'CriarArquivoConfiguracaoBd'");
        }
    }
}