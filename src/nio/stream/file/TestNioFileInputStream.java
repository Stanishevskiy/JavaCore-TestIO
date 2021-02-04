package nio.stream.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioFileInputStream {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("myNioStreamFile.txt");

        try {
            byte[] readBytes = Files.readAllBytes(path);
            for (byte bt : readBytes) {
                System.out.print(Character.toChars(bt));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
