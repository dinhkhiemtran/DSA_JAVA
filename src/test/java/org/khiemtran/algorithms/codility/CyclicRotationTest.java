package org.khiemtran.algorithms.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {
    @Test
    public void case1() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        Assertions.assertArrayEquals(new int[]{9, 7, 6, 3, 8},
                cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
    }
}