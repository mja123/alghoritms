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
        System.out.println(permutation(3, 2));
    }
}
