package tasks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы
 */
public class Task1 {

    private static final String VOWELS = "ёеыаоэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char first = word.charAt(0);
                if (VOWELS.indexOf(first) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
