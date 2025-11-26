package br.com.lucas.openutilitypack.database.config;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivoConfiguracaoBd {
    public static void arquivoConfiguracaoBd() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("properties"));
            bw.write("{\n" +
                    "    \"url\": \"\",\n" +
                    "    \"user\": \"\",\n" +
                    "    \"senha\": \"\"\n" +
                    "}");
            bw.flush();
        } catch(IOException e) {
            System.err.println("Erro durante a criação do arquivo 'properties.json' na classe 'CriarArquivoConfiguracaoBd'");
        }
    }
}