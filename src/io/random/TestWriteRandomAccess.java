package io.random;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestWriteRandomAccess {

    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("myRandomAccessFile.dat", "rw")) {
            for (int i = 0; i < 5; i++) {
                String myText = "Plain simple text " + (i + 1) + " for random access file.\n";
                randomAccessFile.seek(i * myText.length());
                randomAccessFile.write(myText.getBytes());
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException appear: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException appear: " + e.getMessage());
        }
    }
}
