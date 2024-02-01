package tools;

import java.util.*;

public class App {

    private static final List<String> stopWords = List.of(
            "а", "без", "ближе", "браво", "бы", "вам", "вас", "весь", "во", "все", "всего", "вы"
    );
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int finish = nums.length - 1;
        while (start <= finish) {
            int middle = (start + finish) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                finish = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-23, 23, 100, 13, -34, 64, 23523, 203};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static String run(List<Map<String, String>> phoneBook, String name) {
        if (phoneBook.isEmpty()) {
            return "Phonebook is empty!";
        }
        int first = 0;
        int last = phoneBook.size() - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (name.equals(phoneBook.get(middle).get("name"))) {
                return phoneBook.get(middle).get("number");
            }
            else if (name.compareTo(phoneBook.get(middle).get("name")) < 0) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return "Name not found!";
    }

    public static void hanoi(int height, int from, int to) {
        if (height == 1) {
            System.out.printf("с %d на %d%n", from, to);
            return;
        }
        int temporary = 6 - from - to;
        hanoi(height - 1, from, temporary);
        System.out.printf("c %d на %d%n", from, to);
        hanoi(height - 1, temporary, to);
    }

    public static void bubbleSort(int[] items) {
        for (int limit = items.length - 1; limit > 0; limit--) {
            for (int i = 0; i < limit; i++) {
                if (items[i] > items[i + 1]) {
                    int temporary = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temporary;
                }
            }
        }
    }
    public static void selectionSort(int[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[minIndex]) {
                    minIndex = j;
                }
            }
            int temporary = items[i];
            items[i] = items[minIndex];
            items[minIndex] = temporary;
        }
    }

    private static int partition(int[] items, int left, int right, int pivot) {
        while (true) {
            while (items[left] < pivot) {
                left++;
            }
            while (items[right] > pivot) {
                right--;
            }
            if (left >= right) {
                return right + 1;
            }
            int temporary = items[left];
            items[left] = items[right];
            items[right] = temporary;
            left++;
            right--;
        }
    }

    private static void quickSort(int[] items, int left, int right) {
        int length = right - left + 1;
        if (length < 2) {
            return;
        }
        int pivot = items[left];
        int splitIndex = partition(items, left, right, pivot);
        quickSort(items, left, splitIndex - 1);
        quickSort(items, splitIndex, right);
    }

    public static void quickSort(int[] items) {
        quickSort(items, 0, items.length - 1);
    }
}
