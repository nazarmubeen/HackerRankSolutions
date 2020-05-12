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
        DFS(islandGrid, row + 1, col); // go down
        DFS(islandGrid, row - 1, col); //go top
        DFS(islandGrid, row, col + 1); //go right
        DFS(islandGrid, row, col - 1); // go left
    }


//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        changeValues(sr, sc, image[sr][sc], image, newColor, visited);
        return image;

    }

    void changeValues(int x, int y, int oldValue, int[][] image, int newValue, boolean[][] visited) {
        //    System.out.println("x "+x+" y "+y+"oldvalue "+oldValue+" newvalue "+newValue);
        if (x < 0 || x >= image.length || y < 0 || y >= image[x].length || oldValue != image[x][y] || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        oldValue = image[x][y];
        image[x][y] = newValue;

        changeValues(x + 1, y, oldValue, image, newValue, visited);
        changeValues(x - 1, y, oldValue, image, newValue, visited);
        changeValues(x, y + 1, oldValue, image, newValue, visited);
        changeValues(x, y - 1, oldValue, image, newValue, visited);

    }
}
