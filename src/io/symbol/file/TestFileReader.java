package io.symbol.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

    public static void main(String[] args) {

        File myFile1 = new File("mySymbolFile1.txt");

        try (FileReader fileReader = new FileReader(myFile1)) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                System.out.print(readChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
