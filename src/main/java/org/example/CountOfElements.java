package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountOfElements {
    public static Map<String, Integer> getElementWithCountMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> result = getElementWithCountMap(array);
        System.out.println(result);
    }
}
