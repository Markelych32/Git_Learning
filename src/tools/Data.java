package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static void main(String[] args) {
        String[] s1 = new String[] {"bag", "angular", "meal", "cite"};
        String[] s2 = new String[] {"fog", "dog", "cat", "apple", "noise"};
        String[] s3 = new String[] {"zot", "nice", "smile"};

        List<String[]> arrays = new ArrayList<>(List.of(s1, s2, s3));

        arrays.sort((String[] a, String[] b) -> {
            return a.length - b.length;
        });

        for (String[] str : arrays) {
            System.out.println(Arrays.toString(str));
        }
    }
    static void testMethod() {
        System.out.println("THIS IS TEST");
    }
}