package org.khiemtran.algorithms.arrays.basic;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = sortedString(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }

    private String sortedString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : charArray) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

}
