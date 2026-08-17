package org.khiemtran.algorithms.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {
    @Test
    public void case1() {
        BinaryGap binaryGap = new BinaryGap();
        Assertions.assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void case2() {
        BinaryGap binaryGap = new BinaryGap();
        Assertions.assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void case3() {
        BinaryGap binaryGap = new BinaryGap();
        Assertions.assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void case4() {
        BinaryGap binaryGap = new BinaryGap();
        Assertions.assertEquals(1, binaryGap.solution(32));
    }
}