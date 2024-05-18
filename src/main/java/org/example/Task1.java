package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> mapStringLengths(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "здесь");
        Map<String, Integer> stringLengths = mapStringLengths(strings);
        System.out.println(stringLengths);
    }
}
