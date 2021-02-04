package io.stream.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) {

        File file = new File("myStreamFile1.txt");

        try (FileInputStream fis = new FileInputStream(file)) {
            while (fis.available() > 0) {
                System.out.print(Character.toChars(fis.read()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
