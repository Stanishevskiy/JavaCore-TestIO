package nio.symbol.buffer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioBufferedWriter {

    public static void main(String[] args) {

        Path myBufferedPath1 = FileSystems.getDefault().getPath("myNioBufferedFile.txt");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(myBufferedPath1)) {
            for (int i = 1; i <= 5; i++) {
                bufferedWriter.write("My Nio buffered plain text " + i + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
