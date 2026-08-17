package org.khiemtran.algorithms.arrays.basic;

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int width = right - left;
            int heigh = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, width * heigh);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
