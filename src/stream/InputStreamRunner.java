package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
         try (FileInputStream inputStream = new FileInputStream(file)) {
             byte[] bytes = new byte[inputStream.available()];
             int counter = 0;
             byte currentByte;
             while ((currentByte = (byte) inputStream.read()) != -1) {
                 bytes[counter++] = currentByte;
             }
             String stringValue = new String(bytes);
             System.out.println(stringValue);
         }
    }
}
