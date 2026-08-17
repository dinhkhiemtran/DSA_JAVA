package org.khiemtran.algorithms.arrays.basic;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class ContainsDuplicate {
    Dictionary<Integer, Integer> ht = new Hashtable<>();
    public boolean hasDuplicated(int[] numbs) {
        int[] numbsStored = getSorted(numbs);
        for (int i = 1; i < numbsStored.length; i++) {
            if (numbs[i - 1] == numbs[i]) {
                return true;
            }
        }
        return false;
    }

    private int[] getSorted(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] > numbs[j]) {
                    int temp = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = temp;
                }
            }
        }
        return numbs;
    }
}
