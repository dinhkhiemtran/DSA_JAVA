package org.khiemtran.algorithms.codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int n = A.length;
        if (n == 0) {
            return A;
        }
        K = K % n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + K) % n;
            result[newIndex] = A[i];
        }

        return result;
    }
}
