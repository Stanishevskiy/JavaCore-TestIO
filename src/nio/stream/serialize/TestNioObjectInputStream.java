package nio.stream.serialize;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioObjectInputStream {

    public static void main(String[] args) {

        Path myNioObjectOutputStream1 = FileSystems.getDefault().getPath("myNioStreamObjectFile.dat");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(myNioObjectOutputStream1)))) {
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
