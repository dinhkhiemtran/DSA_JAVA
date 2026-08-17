package org.khiemtran.algorithms.codility.assessment;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int b = n - i;
            if (isNotZero(i) && (isNotZero(b))) {
                return new int[]{i, b};
            }
        }
        return new int[0];
    }

    private boolean isNotZero(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
