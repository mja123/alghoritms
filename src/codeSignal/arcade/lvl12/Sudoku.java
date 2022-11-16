package codeSignal.arcade.lvl12;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    static boolean solution(int[][] grid) {
        for (int i = 0; i < grid.length; i+=3) {
            for (int j = 0; j < grid[i].length; j+=3) {

                if (!checkElementSubMatrix(grid, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }


    static boolean checkElementSubMatrix(int[][] grid, int i, int j) {
        Set<Integer> uniqueNumbers = new HashSet<Integer>();

        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (!checkCol(grid, l)) {
                    return false;
                }

                if (!checkRow(grid, k)) {
                    return false;
                }

                if (uniqueNumbers.contains(grid[k][l])) {
                    return false;
                }

                uniqueNumbers.add(grid[k][l]);
            }
        }
        return true;
    }

    static boolean checkRow(int[][] grid, int i) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int col = 0; col < grid[i].length; col++) {
            if (uniqueNumbers.contains(grid[i][col])) {
                System.out.println("row i: " + i);
                return false;
            }
            uniqueNumbers.add(grid[i][col]);
        }
        return true;
    }

    static boolean checkCol(int[][] grid, int j) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int[] row : grid) {
            if (uniqueNumbers.contains(row[j])) {
                System.out.println("row j: " + j);
                return false;
            }
            uniqueNumbers.add(row[j]);
        }
        return true;
    }

    public static void main(String[] args) {    
        int[][] grid = {{5,3,4,6,7,8,9,1,2},
                        {6,7,2,3,9,5,3,4,8},
                        {1,9,8,1,4,2,5,6,7},
                        {8,5,9,7,6,1,4,2,3},
                        {4,2,6,8,5,3,7,9,1},
                        {7,1,3,9,2,4,8,5,6},
                        {9,6,1,5,3,7,2,8,4},
                        {2,8,7,4,1,9,6,3,5},
                        {3,4,5,2,8,6,1,7,9}};

        System.out.println(solution(grid));
    }
}
