package tools;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5, 3, 2};
        System.out.println(solution(a));
        System.out.println((char)('a' + 1));
    }

    public static int solution(int[] a) {
        if (a.length == 0) return -1;
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            if ((temp & a[i]) == 0)
                return temp;
            else {
                temp = a[i];
            }
        }
        return -1;
    }
    static class Printer {
        public <T> void print(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    String[] names = {"Mark", "Alice", "Nick", "Tom"};
    MyPrinter printer = new MyPrinter();
    // printer.print(names);
}

