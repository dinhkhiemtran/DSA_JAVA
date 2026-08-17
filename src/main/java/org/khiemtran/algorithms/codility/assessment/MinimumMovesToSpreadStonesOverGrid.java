package org.khiemtran.algorithms.codility.assessment;

public class MinimumMovesToSpreadStonesOverGrid {
    private int ans = Integer.MAX_VALUE;

    public int minimumMoves(int[][] grid) {
        dfs(grid, 0);
        return ans;
    }

    private void dfs(int[][] grid, int moves) {
        if (moves >= ans) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (grid[i][j] == 0) {
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            if (grid[r][c] > 1) {
                                grid[r][c]--;
                                grid[i][j]++;
                                int cost = Math.abs(r - i) + Math.abs(c - j);
                                dfs(grid, moves + cost);
                                // Backtrack
                                grid[r][c]++;
                                grid[i][j]--;
                            }
                        }
                    }
                    return;
                }
            }
        }
        ans = Math.min(ans, moves);
    }
}
