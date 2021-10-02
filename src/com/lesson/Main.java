package com.lesson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] Words = {"a", "b", "b", "c", "d", "d", "e", "f", "j", "j",
        "i", "f", "f", "g", "h", "h", "k", "l", "m", "n"};
        Map<String, Integer> map = new HashMap<>();
        for (String word: Words) {
            if (map.containsKey(word)) {
                int cnt = map.get(word);
                map.put(word, ++cnt);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}

