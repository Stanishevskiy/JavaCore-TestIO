package io.stream.serialize;

import java.io.*;

public class TestObjectOutputStream {

    public static void main(String[] args) {

        File myObjectOutStream1 = new File("myStreamObjectFile1.dat");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(myObjectOutStream1)))) {
            for (int i = 1; i <= 5; i++) {
                objectOutputStream.writeObject(
                        new MySerializableObject(i,
                                "My serialize object has child: ",
                                new MySerializableChild(0.1 + i, 0.2 +i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
