package org.khiemtran.algorithms.arrays.basic;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sortedString(s).equals(sortedString(t));
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
