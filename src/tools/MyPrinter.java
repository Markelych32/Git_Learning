package tools;

public class MyPrinter {
    public <T> void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
