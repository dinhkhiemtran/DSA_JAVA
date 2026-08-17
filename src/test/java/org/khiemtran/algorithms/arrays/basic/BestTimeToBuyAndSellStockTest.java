package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    public void case1() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        Assertions.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void case2() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        Assertions.assertEquals(6,
                bestTimeToBuyAndSellStock.maxProfit(new int[]{10,1,5,6,7,1}));
    }

    @Test
    public void case3() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        Assertions.assertEquals(0,
                bestTimeToBuyAndSellStock.maxProfit(new int[]{10,8,7,5,2}));
    }
}