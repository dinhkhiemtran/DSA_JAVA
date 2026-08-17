package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    @Test
    public void case1() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean isAnagram = validAnagram.isAnagram("racecar", "carrace");
        Assertions.assertTrue(isAnagram);
    }

    @Test
    public void case2() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean isAnagram = validAnagram.isAnagram("jar", "jam");
        Assertions.assertFalse(isAnagram);
    }

    @Test
    public void case3() {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean isAnagram = validAnagram.isAnagram("abc", "bcad");
        Assertions.assertFalse(isAnagram);
    }
}