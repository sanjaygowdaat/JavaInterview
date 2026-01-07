package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriterNIO {
    public static void main(String[] args) {
        Path path = Paths.get("TradeOffs.txt");
        String content = "This new line is added to an already existing file with content";
        try {
            Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
