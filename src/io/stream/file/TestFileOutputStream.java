package io.stream.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

    public static void main(String[] args) {

        File file = new File("myStreamFile1.txt");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            for (int i = 1; i <= 5; i++) {
                String myString = "My string converted into bytes " + i + '\n';
                fos.write(myString.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
