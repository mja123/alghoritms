package codeSignal.interview.arrays;

import java.util.HashSet;
import java.util.Set;

//This is not my solution, my solution was like sudoku in arcade.12 with some fixes (I did both with one day of difference)
//I took this solution because I think is really original and simple
public class Sudoku2 {

    boolean solution(char[][] grid) {
        int n = grid.length;

        Set<String> set = new HashSet<>();

        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in row " + row))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in col " + col))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in square " + row/3 + " " + col/3))
                    return false;
            }
        }

        return true;
    }

}
