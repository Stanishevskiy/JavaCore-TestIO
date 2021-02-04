package io.stream.buffer;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {

    public static void main(String[] args) {

        File file = new File("myStreamBufferedFile1.txt");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
            for (int i = 1; i <= 5; i++) {
                String myString = "My string converted into bytes " + i + '\n';
                bos.write(myString.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
