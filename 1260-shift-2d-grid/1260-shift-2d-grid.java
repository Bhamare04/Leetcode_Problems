import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] temp = new int[rows][cols];

        // Move each element to its new position
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Convert 2D position to 1D index
                int index = i * cols + j;

                // Calculate new index after k shifts
                int newIndex = (index + k) % (rows * cols);

                // Convert new 1D index back to 2D position
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;

                // Place the element in the new position
                temp[newRow][newCol] = grid[i][j];
            }
        }

        // Convert 2D array to List<List<Integer>>
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(temp[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}