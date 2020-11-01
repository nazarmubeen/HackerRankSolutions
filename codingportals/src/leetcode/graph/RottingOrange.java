package leetcode.graph;

class RottingOrange {
    public int num_fresh = 0;

    public int orangesRotting(int[][] grid) {
        int max = 0;
        int num_rot = 0;
        /* Find number of rottern and fresh oranges */
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1)
                    num_fresh++;
                else if (grid[i][j] == 2)
                    num_rot++;
        }

        /* If there are no fresh oranges, return 0 */
        if (num_fresh == 0) return 0;
        /* If there are no rotten oranges, we can't rot the fresh ones */
        if (num_rot == 0) return -1;

        /* Recursively rot the oranges.
         * Update the fresh oranges to 2+x, where x is the time in minutes.
         * In the end, we will just deduct 2 from the max value to get number of minutes */
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 2) {
                    System.out.println("original i " + i + " j " + j);
                    System.out.println("original call  grid[i][j] " + grid[i][j]);
                    rotNextHelper(grid, i, j, grid[i][j]);
                    System.out.println("original call end grid[i][j] " + grid[i][j]);
                }
        }

        /* Find the max value in the grid. That max value - 2 is the answer */
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
                max = Math.max(max, grid[i][j]);
        }
        return num_fresh == 0 ? max - 2 : -1;
    }

    /* Recursively iterate and rot oranges */
    private void rotNextOrange(int[][] grid, int i, int j, int d) {
        System.out.println(" i " + i + " j " + j);
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] == 0 || grid[i][j] == 2) {
            System.out.println(" return grid[i][j] ");
            return;
        }


        System.out.println("inside grid[i][j] " + grid[i][j]);


        if (grid[i][j] == 1) {
            num_fresh--;
            grid[i][j] = d + 1;
        } else if (grid[i][j] > 2) {
            /* If the rotten orange could have been rotted sooner reaching
             * from another cell, update to minimum value */
            if (grid[i][j] <= d + 1)
                return;
            grid[i][j] = d + 1;
        }
        /* Continue to rot neighboring cells */
        rotNextHelper(grid, i, j, grid[i][j]);
    }

    /* Helper function to call neighboring 4 cells */
    public void rotNextHelper(int[][] grid, int i, int j, int d) {
        rotNextOrange(grid, i - 1, j, grid[i][j]);
        rotNextOrange(grid, i + 1, j, grid[i][j]);
        rotNextOrange(grid, i, j - 1, grid[i][j]);
        rotNextOrange(grid, i, j + 1, grid[i][j]);
    }
}