package codeSignal.arcade.lvl2;

import java.util.ArrayList;
import java.util.List;

//https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr
public class MatrixElementsSum {
    int solution(int[][] matrix) {
        List<Integer> cancelColumns = new ArrayList<>();
        int totalPrice = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (cancelColumns.contains(j)) {
                    continue;
                }
                if (matrix[i][j] == 0) {
                    cancelColumns.add(j);
                } else {
                    totalPrice += matrix[i][j];
                }
            }
        }
        return totalPrice;
    }
}
