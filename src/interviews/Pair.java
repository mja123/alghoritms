package interviews;

import java.util.HashSet;
import java.util.Set;

/**
 * A function called pairs() takes an array, for example [3,1,8].
 * It should return all pairs, e.g. for mentioned example: [
 *                                                         [3,1]
 *                                                         [3,8],
 *                                                         [1,8]
 *                                                         ].
 * Implement it please
 **/
public class Pair {
    public static int[][] solution(int[] numbers) {

        int columns = 2;
        int rows = permutation(numbers.length, columns);
        int[][] pairs = new int[rows][columns];

        int rowIndex = 0;
        for (int i = 0; i < rows; i++) {
            int columnIndex = 1 + i;

            while (columnIndex < numbers.length ) {
                pairs[rowIndex][0] = numbers[i];
                pairs[rowIndex][1] = numbers[columnIndex];
                columnIndex++;
                rowIndex++;
            }

        }
        return pairs;
    }
    private static int permutation(int n, int r) {
        return (factorial(n) / (factorial(r) * factorial(n - r)));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 3, 4, 5};
        int[][] result = solution(input);
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }
        //
    /*  0,1
        0,2
        0,3
        0,4
        0,5
        1,2
        1,3
        1,4
        1,5
        2,3
        2,4
        2,5
        3,4
        3,5
        4,5

         */
    }
}
