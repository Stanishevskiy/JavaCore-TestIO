package io.symbol.print;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

    public static void main(String[] args) {

        File file = new File("mySymbolFile2.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 1; i <=5; i++) {
                printWriter.println("My printed string " + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
