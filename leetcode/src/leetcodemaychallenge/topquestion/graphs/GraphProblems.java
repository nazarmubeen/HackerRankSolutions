package leetcodemaychallenge.topquestion.graphs;

public class GraphProblems {

//https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/792/
    public int numIslands(char[][] grid) {


        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int h = grid.length;
        if (h == 0)
            return 0;
        int l = grid[0].length;
        int result = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == '1') {
                    DFS(grid, i,  j);
                    result++;
                }
            }
        }
        return result;
    }

    public void DFS(char[][] islandGrid, int row, int col) {

        int H = islandGrid.length;
        int L = islandGrid[0].length;

        if (row < 0 || col < 0 || row >= H || col >= L || islandGrid[row][col] != '1')
            return;
        islandGrid[row][col] = '0'; //marking it visited
        DFS(islandGrid, row+ 1, col); // go down
        DFS(islandGrid, row- 1, col); //go top
        DFS(islandGrid, row, col + 1); //go right
        DFS(islandGrid, row, col - 1); // go left
    }
}
