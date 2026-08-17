package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    public void case1() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 4, 5, 6}, 7);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void case2() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{4, 5, 6}, 10);
        Assertions.assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void case3() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{5, 5}, 10);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }
}