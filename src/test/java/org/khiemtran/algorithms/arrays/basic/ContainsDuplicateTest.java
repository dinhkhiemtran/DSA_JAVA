package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
    @Test
    public void case1() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean isDuplicated = containsDuplicate.hasDuplicated(new int[]{1, 2, 3, 3});
        Assertions.assertTrue(isDuplicated);
    }

    @Test
    public void case2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean isDuplicated = containsDuplicate.hasDuplicated(new int[]{1, 2, 3, 4});
        Assertions.assertFalse(isDuplicated);
    }
}