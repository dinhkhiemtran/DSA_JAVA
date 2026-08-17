package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void case1() {
        ThreeSum threeSum = new ThreeSum();
        Assertions.assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)),
                threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    public void case2() {
        ThreeSum threeSum = new ThreeSum();
        Assertions.assertEquals(List.of(List.of(0,0,0)),
                threeSum.threeSum(new int[]{0,0,0}));
    }

}