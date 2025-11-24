package br.com.lucas.openutilitypack.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivoDeTexto {
    public static void escrevendoArquivoDeTexto(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados-escrita-java.txt"));
            bw.write("Esse é um arquivo de texto escrito a partir do Java!");
            bw.flush();
            System.out.println("Arquivo de texto gerado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro de escrita de arquivos na classe 'EscreverArquivoDeTexto'= " +
                    e.getMessage());
        }
    }
}