package org.khiemtran.algorithms.codility;

public class NoZeroIntegers {
    public int[] solution(int n) {
        for (int i = 1; i < n; i++) {
            int b = n - i;
            if (isNoZero(i) && isNoZero(b)) {
                return new int[]{i, b};
            }
        }
        return new int[0];
    }

    private boolean isNoZero(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
