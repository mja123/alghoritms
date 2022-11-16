package codeSignal.arcade.lvl5;

public class MinesWeeper {
    int[][] solution(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                int minesCounter = checkAdjacets(matrix, i, j);

                result[i][j] = minesCounter;
            }
        }
        return result;
    }

    private int checkAdjacets(boolean[][] matrix, int i, int j) {
        int minesCounter = 0;
        if ((i - 1) >= 0) {
            if (matrix[i - 1][j]) {
                minesCounter ++;
            }
            if ((j - 1) >= 0) {
                if (matrix[i - 1][j - 1]) {
                    minesCounter ++;
                }
            }
            if ((j + 1) <= (matrix[i].length - 1)) {
                if (matrix[i - 1][j + 1]) {
                    minesCounter ++;
                }
            }
        }
        if ((i + 1) <= (matrix.length - 1)) {
            if (matrix[i + 1][j]) {
                minesCounter ++;
            }
            if ((j - 1) >= 0) {
                if (matrix[i + 1][j - 1]) {
                    minesCounter ++;
                }
            }
            if ((j + 1) <= (matrix[i].length - 1)) {
                if (matrix[i + 1][j + 1]) {
                    minesCounter ++;
                }
            }
        }
        if ((j - 1) >= 0) {
            if (matrix[i][j - 1]) {
                minesCounter ++;
            }
        }
        if ((j + 1) <= (matrix[i].length - 1)) {
            if (matrix[i][j + 1]) {
                minesCounter ++;
            }
        }
        return minesCounter;
    }

}
