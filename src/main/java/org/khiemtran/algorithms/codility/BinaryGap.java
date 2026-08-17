package org.khiemtran.algorithms.codility;

public class BinaryGap {
    public int solution(int N) {
        String stringBinary = Integer.toBinaryString(N);
        int max = 1;
        int count = 0;
        for (char c : stringBinary.toCharArray()) {
            if (c == '1') {
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
        }
        return max;
    }
}
