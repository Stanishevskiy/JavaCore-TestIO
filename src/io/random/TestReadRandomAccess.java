package io.random;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestReadRandomAccess {

    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("myRandomAccessFile.dat", "r")) {
            randomAccessFile.seek(0);
            byte[] bytes = new byte[(int) randomAccessFile.length()];
            randomAccessFile.read(bytes);
            System.out.print(new String(bytes));

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException appear: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException appear: " + e.getMessage());
        }
    }
}
