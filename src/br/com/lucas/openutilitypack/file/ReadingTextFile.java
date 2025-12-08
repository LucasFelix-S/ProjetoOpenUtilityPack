package br.com.lucas.openutilitypack.file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {
    public static void showTextFile(String textFile) {
        String content = "";
        try(BufferedReader br = new BufferedReader(new FileReader(textFile))){
            while((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            System.err.println("Failed to read file: " + textFile
                                + " Error details: " + e.getMessage());
        }
    }
}