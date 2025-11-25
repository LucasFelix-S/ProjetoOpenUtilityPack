package br.com.lucas.openutilitypack.app;
import br.com.lucas.openutilitypack.database.config.LerArquivoConfiguracaoBd;
import br.com.lucas.openutilitypack.file.EscreverArquivoDeTexto;
import br.com.lucas.openutilitypack.file.LerArquivoDeTexto;

public class App {
    public static void main(String[] args) {
        LerArquivoConfiguracaoBd.lendoArquivo();
        LerArquivoDeTexto.lendoArquivoDeTexto();
        EscreverArquivoDeTexto.escrevendoArquivoDeTexto();
    }
}