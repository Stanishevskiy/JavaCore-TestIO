package io.symbol.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

    public static void main(String[] args) {

        File myBufferedFile1 = new File("mySymbolBufferedFile1.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myBufferedFile1))) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
