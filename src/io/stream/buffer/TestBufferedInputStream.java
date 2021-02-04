package io.stream.buffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

    public static void main(String[] args) {

        File file = new File("myStreamBufferedFile1.txt");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            while (bis.available() > 0) {
                System.out.print(Character.toChars(bis.read()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
