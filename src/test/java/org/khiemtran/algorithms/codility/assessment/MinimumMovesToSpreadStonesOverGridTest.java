package org.khiemtran.algorithms.codility.assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumMovesToSpreadStonesOverGridTest {
    @Test
    void case1() {
        MinimumMovesToSpreadStonesOverGrid minimumMovesToSpreadStonesOverGrid = new MinimumMovesToSpreadStonesOverGrid();
        Assertions.assertEquals(3,
                minimumMovesToSpreadStonesOverGrid.minimumMoves(
                        new int[][]{
                                {1, 1, 0},
                                {1, 1, 1},
                                {1, 2, 1}
                        }));
    }

    @Test
    void case2() {
        MinimumMovesToSpreadStonesOverGrid minimumMovesToSpreadStonesOverGrid = new MinimumMovesToSpreadStonesOverGrid();
        Assertions.assertEquals(4,
                minimumMovesToSpreadStonesOverGrid.minimumMoves(
                        new int[][]{
                                {1, 3, 0},
                                {1, 0, 0},
                                {1, 0, 3}
                        }));
    }

    @Test
    void case3() {
        MinimumMovesToSpreadStonesOverGrid minimumMovesToSpreadStonesOverGrid = new MinimumMovesToSpreadStonesOverGrid();
        Assertions.assertEquals(9,
                minimumMovesToSpreadStonesOverGrid.minimumMoves(
                        new int[][]{
                                {0, 4, 0},
                                {0, 0, 0},
                                {0, 5, 0}
                        }));
    }

}