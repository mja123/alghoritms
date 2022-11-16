package codeSignal.arcade.lvl12;

import java.util.Arrays;

public class SpiralNumber {
    static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = 0;
        int counter = 1;

        int[] borders = {0, n - 1};

        while (matrix[n / 2][n / 2] == 0) {

            while (i == borders[0] && j <= borders[1]) {
                matrix[i][j++] = counter++;
            }
            j--;
            i++;
            while (i <= borders[1] && j == borders[1]) {
                matrix[i++][j] = counter++;
            }
            i--;
            j--;
            while (i == borders[1] && j > borders[0]) {
                matrix[i][j--] = counter++;
            }

            while (i > borders[0] && j == borders[0]) {
                matrix[i--][j] = counter++;
            }
            i++;
            j++;
            borders[0] += 1;
            borders[1] -= 1;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Arrays.stream(solution(3)).forEach(System.out::println);
    }
}
