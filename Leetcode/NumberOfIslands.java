/**
 * Link - https://leetcode.com/problems/number-of-islands/
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 *
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 *
 * Constraints:
 *
 *     m == grid.length
 *     n == grid[i].length
 *     1 <= m, n <= 300
 *     grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islands += 1;
                    checkAllSides(grid, i, j, n, m);
                }
            }
        }
        return islands;
    }
    private void checkAllSides (char[][] arr, int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && arr[i][j] == '1') {
            arr[i][j] = '#';
            checkAllSides(arr, i-1, j, n, m);
            checkAllSides(arr, i+1, j, n, m);
            checkAllSides(arr, i, j-1, n, m);
            checkAllSides(arr, i, j+1, n, m);
        }
    }
}
