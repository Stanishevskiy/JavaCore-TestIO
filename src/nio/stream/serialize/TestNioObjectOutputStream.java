package nio.stream.serialize;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioObjectOutputStream {

    public static void main(String[] args) {

        Path myNioObjectOutputStream1 = FileSystems.getDefault().getPath("myNioStreamObjectFile.dat");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(myNioObjectOutputStream1)))) {
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
