package org.khiemtran.algorithms.codility.assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {
    @Test
    public void case1() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers convertIntegerToTheSumOfTwoNoZeroIntegers = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        Assertions.assertArrayEquals(new int[]{1, 99},
                convertIntegerToTheSumOfTwoNoZeroIntegers.getNoZeroIntegers(100));
    }

    @Test
    public void case2() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers convertIntegerToTheSumOfTwoNoZeroIntegers = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        Assertions.assertArrayEquals(new int[]{2, 9},
                convertIntegerToTheSumOfTwoNoZeroIntegers.getNoZeroIntegers(11));
    }
}