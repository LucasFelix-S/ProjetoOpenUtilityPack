package br.com.lucas.openutilitypack.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFile {
    String content;

    public WritingTextFile(String content){
        this.content = content;
    }

    public void writeTextFile(String nameOutputFile) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nameOutputFile))) {
            if(content != null) {
                bw.write(content);
                bw.flush();
            } else {
                bw.write("Generating a default text for the file.");
                bw.flush();
            }
        } catch (IOException e) {
            System.err.println("Failed to write file " +
                                "Error details: " + e.getMessage());
        }
    }
}