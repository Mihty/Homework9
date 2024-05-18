package org.example;
import java.util.*;

    public class Task2 {

    public static Map<Integer, List<String>> mapStringsByLength(List<String> strings) {
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        for (String str : strings) {
            int length = str.length();
            lengthMap.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }

        return lengthMap;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("тут", "там", "здесь");
        Map<Integer, List<String>> result = mapStringsByLength(strings);

        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}