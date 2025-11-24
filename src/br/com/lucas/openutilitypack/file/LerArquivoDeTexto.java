package br.com.lucas.openutilitypack.file;
import java.io.BufferedReader;
import java.io.FileReader;

public class LerArquivoDeTexto {
    public static String lendoArquivoDeTexto(){
        String linha = "";
        try{
            String arquivo = "dados-leitura-java.csv";
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }catch(Exception e) {
            System.err.println("Erro durante a leitura do arquivo de texto na classe 'LerArquivoDeTexto'= "
                    + e.getMessage());
        }
        return linha;
    }
}