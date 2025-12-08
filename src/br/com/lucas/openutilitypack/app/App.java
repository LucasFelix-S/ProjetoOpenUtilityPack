package br.com.lucas.openutilitypack.app;
import br.com.lucas.openutilitypack.database.config.DataBaseManager;
import br.com.lucas.openutilitypack.file.ReadingTextFile;
import br.com.lucas.openutilitypack.file.WritingTextFile;

public class App {
    public static void main(String[] args) {
        String arquivo = "teste.txt";
        ReadingTextFile.showTextFile(arquivo);

        WritingTextFile writingTextFileNull = new WritingTextFile(null);
        writingTextFileNull.writeTextFile("arquivoPadraoNull.txt");

        WritingTextFile writingTextFile = new WritingTextFile("Escrevendo algo...");
        writingTextFile.writeTextFile("arquivoPadrao.txt");

        DataBaseManager.connectionDataBase();
    }
}