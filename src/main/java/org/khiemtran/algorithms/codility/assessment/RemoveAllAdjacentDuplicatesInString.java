package org.khiemtran.algorithms.codility.assessment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveAllAdjacentDuplicatesInString {
    public String solution(String s) {
        Map<Character, Integer> map = new ConcurrentHashMap<>();

        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }

}
