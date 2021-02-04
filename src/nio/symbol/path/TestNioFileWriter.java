package nio.symbol.path;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class TestNioFileWriter {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("myNioSymbolFile.txt");

        StringBuilder myStr = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            myStr.append("My Nio plain text ").append(i).append('\n');
        }
        try {
            Files.write(path, Collections.singletonList(myStr), new StandardOpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.WRITE});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
