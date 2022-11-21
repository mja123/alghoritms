package groockingAlgBook.excercises;

import java.util.HashMap;
import java.util.Map;

public class unit1 {
    /*
    1.1 Suppose you have a sorted list of 128 names, and you’re searching through it using binary search.
    What’s the maximum number of steps it would take?

    Using binary search, the worst case is log2(n) that means, is the number's logarithm in base 2
    In this case: log2(128) = 7. That means, in the worst case, we have to perform 7 steps

    1.2 Suppose you double the size of the list. What’s the maximum number of steps now?
    Because we are using base 2 (binary search) when we have to duplicate the list's size, we have to increase
    in one the result, that means, add one in the result

    log2(256) = 8
    2^0 = 1
    2^1 = 2
    2^2 = 4
    2^3 = 8
    2^4 = 16
    2^5 = 32
    2^6 = 64
    2^7 = 128
    2^8 = 256
    2 000 000 000
    Welcome to binary code (byte representation)
     */
    public static void main(String[] args) {
        System.out.println(recursiveBinaryCalculus(1024, 0));
        System.out.println(loopBinaryCalculus(2000000000));
        System.out.println(Math.pow(2, 31));

    }

    public static int recursiveBinaryCalculus(int number, int steps) {

        if (number <= 1) {
            return steps;
        }
        steps++;
        return recursiveBinaryCalculus(number / 2, steps);
    }

    public static int loopBinaryCalculus(int number) {
        int steps = 1;

        while (number > 2) {
            number /= 2;
            steps++;
        }
        return steps;
    }


}
