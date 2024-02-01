package stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("resources", "writer2.txt");
        Files.write(file, List.of("Hello, World!", "Java", "Python"));
    }
}
