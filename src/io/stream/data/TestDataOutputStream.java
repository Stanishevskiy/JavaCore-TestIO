package io.stream.data;

import java.io.*;

public class TestDataOutputStream {

    public static void main(String[] args) {

        File myDataOutStream1 = new File("myStreamDataFile1.dat");

        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(myDataOutStream1)))) {
            for (int i = 1; i <= 5; i++) {
                dataOutputStream.writeUTF("My data stream number ");
                dataOutputStream.writeInt(i);
                dataOutputStream.writeChar('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
