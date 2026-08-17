package org.khiemtran.algorithms.codility.assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveAllAdjacentDuplicatesInStringTest {
    @Test
    public void case1() {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        Assertions.assertEquals("ac",
                removeAllAdjacentDuplicatesInString.solution("bbbccbbbaa"));
    }

    @Test
    public void case2() {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        Assertions.assertEquals("z",
                removeAllAdjacentDuplicatesInString.solution("azza"));
    }

    @Test
    public void case3() {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        Assertions.assertEquals("ca",
                removeAllAdjacentDuplicatesInString.solution("abbaca"));
    }

}