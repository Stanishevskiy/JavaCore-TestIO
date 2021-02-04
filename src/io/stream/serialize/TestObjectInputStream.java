package io.stream.serialize;

import java.io.*;

public class TestObjectInputStream {

    public static void main(String[] args) {

        File myObjectInStream1 = new File("myStreamObjectFile1.dat");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(myObjectInStream1)))) {
            boolean eof = false;
            while (!eof) {
                try {
                    MySerializableObject myObj = (MySerializableObject) objectInputStream.readObject();
                    System.out.println(myObj.toString());
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
