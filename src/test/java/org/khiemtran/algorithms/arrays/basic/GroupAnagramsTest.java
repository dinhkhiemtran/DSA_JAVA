package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class GroupAnagramsTest {

    @Test
    public void case1() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        Assertions.assertEquals(List.of(
                        List.of("hat"),
                        List.of("act", "cat"),
                        List.of("stop", "pots", "tops")),
                lists);
    }

}