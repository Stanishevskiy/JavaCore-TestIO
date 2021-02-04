package nio.symbol.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioBufferedReader {

    public static void main(String[] args) {

        Path myBufferedPath1 = FileSystems.getDefault().getPath("myNioBufferedFile.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(myBufferedPath1)) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
