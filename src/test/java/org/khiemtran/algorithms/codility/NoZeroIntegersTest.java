package org.khiemtran.algorithms.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoZeroIntegersTest {

    @Test
    public void case1() {
        NoZeroIntegers noZeroIntegers = new NoZeroIntegers();
        Assertions.assertArrayEquals(new int[]{1, 2}, noZeroIntegers.solution(3));
    }

    @Test
    public void case2() {
        NoZeroIntegers noZeroIntegers = new NoZeroIntegers();
        Assertions.assertArrayEquals(new int[]{1,122},
                noZeroIntegers.solution(123));
    }

    @Test
    public void case3() {
        NoZeroIntegers noZeroIntegers = new NoZeroIntegers();
        Assertions.assertArrayEquals(new int[]{2, 99},
                noZeroIntegers.solution(101));
    }

}