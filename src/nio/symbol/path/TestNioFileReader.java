package nio.symbol.path;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNioFileReader {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("myNioSymbolFile.txt");

        try {
            for (String myStr : Files.readAllLines(path)) {
                System.out.println(myStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
