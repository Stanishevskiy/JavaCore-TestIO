package io.stream.data;

import java.io.*;

public class TestDataInputStream {

    public static void main(String[] args) {

        File myDataInStream1 = new File("myStreamDataFile1.dat");

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(myDataInStream1)))) {
            boolean eof = false;
            while (!eof) {
                try {
                    System.out.print(dataInputStream.readUTF());
                    System.out.print(dataInputStream.readInt());
                    System.out.print(dataInputStream.readChar());
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
