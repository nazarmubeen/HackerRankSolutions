package leetcode.matrix;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {

    }

    boolean isValid(char[][] sudoku) {

        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            HashSet<Character> boxSet = new HashSet<>();
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            rowMap.put(i, rowSet);
            colMap.put(i, colSet);
            boxMap.put(i, boxSet);
        }

        int i = 0;
        int j = 0;
        int rowMax = 2;
        int colMax = 2;
        int rowMin = 0;
        int colMin = 0;
        int box = 0;

        while (rowMax < 9 && colMax < 9 && box < 9) {
            for (i = rowMin; i <= rowMax; i++) {
                for (j = colMin; j <= colMax; j++) {
                    char value = sudoku[i][j];
                    if (rowMap.get(i).contains(value) || colMap.get(j).contains(value) || boxMap.get(box).contains(value)) {
                        return false;
                    } else if (value != '.') {
                        rowMap.get(i).add(value);
                        colMap.get(j).add(value);
                        boxMap.get(box).add(value);
                    }
                }
            }

            if (colMax >= 8) {
                rowMin = rowMin + 3;
                rowMax = rowMax + 3;
                colMin = 0;
                colMax = 2;
            } else {
                colMin = colMin + 3;
                colMax = colMax + 3;
            }
            box++;

        }
        return true;
    }


}
