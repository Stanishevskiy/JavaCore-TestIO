package io.symbol.buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {

    public static void main(String[] args) {

        File myBufferedFile1 = new File("mySymbolBufferedFile1.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myBufferedFile1))) {
            for (int i = 1; i <= 5; i++) {
                bufferedWriter.write("My buffered plain text " + i + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
