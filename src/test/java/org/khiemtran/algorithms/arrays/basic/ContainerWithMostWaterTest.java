package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {
    @Test
    public void case1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        Assertions.assertEquals(36, containerWithMostWater.maxArea(new int[]{1, 7, 2, 5, 4, 7, 3, 6}));
    }

    @Test
    public void case2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        Assertions.assertEquals(4, containerWithMostWater.maxArea(new int[]{2, 2, 2}));
    }
}