package br.com.lucas.openutilitypack.app;
import br.com.lucas.openutilitypack.database.config.DataBaseManager;
import br.com.lucas.openutilitypack.file.ReadingTextFile;
import br.com.lucas.openutilitypack.file.WritingTextFile;

public class App {
    public static void main(String[] args) {
        //Testando a leitura...
        String arquivo = "teste.txt";
        ReadingTextFile.showTextFile(arquivo);

        //Testando a escrita com o construtor vazio(nulo)...
        WritingTextFile writingTextFileNull = new WritingTextFile(null);
        writingTextFileNull.writeTextFile("arquivoPadraoNull.txt");

        //Testando a escrita com o construtor 'cheio'(com dados para escrita)...
        WritingTextFile writingTextFile = new WritingTextFile("Escrevendo algo...");
        writingTextFile.writeTextFile("arquivoPadrao.txt");

        //Testando a conexão com o Banco de Dados...
        DataBaseManager.readingPropertiesFile();
    }
}