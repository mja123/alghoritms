package codeSignal.arcade.lvl12;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquare {
    int solution(int[][] matrix) {
        Set<Long> combinations = new HashSet<>();
        final int MATRIX_RANGE = 2;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {

                combinations.add(Long.parseLong(createRequiredMatrix(i, j, matrix, MATRIX_RANGE)));
            }
        }
        return combinations.size();
    }
//This allows us to create square matrix of any range
    private String createRequiredMatrix(int i, int j, int[][] matrix, int MATRIX_RANGE) {


        StringBuilder combination = new StringBuilder();
        for (int index = i; index < MATRIX_RANGE + i; index++) {
            for (int k = j; k < MATRIX_RANGE + j; k++) {
                combination.append(matrix[index][k]);
            }
        }
        return combination.toString();
    }
}
