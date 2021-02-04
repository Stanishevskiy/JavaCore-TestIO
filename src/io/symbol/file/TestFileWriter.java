package io.symbol.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

    public static void main(String[] args) {

        File myFile1 = new File("mySymbolFile1.txt");
        try (FileWriter fileWriter = new FileWriter(myFile1)) {
            for (int i = 1; i <= 5; i++) {
                fileWriter.write("My plain text " + i + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
