package nio.stream.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestNioFileOutputStream {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("myNioStreamFile.txt");

        StringBuilder myStr = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            myStr.append("My Nio stream plain text ").append(i).append('\n');
        }
        try {
            Files.write(path, myStr.toString().getBytes(), new StandardOpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.WRITE});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
