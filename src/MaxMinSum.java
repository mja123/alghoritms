import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinSum {
    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        arr.forEach(System.out::println);

        long maxSum = 0;
        long minSum = 0;


        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                minSum += arr.get(i);
                continue;
            }
            if (i == arr.size() - 1) {
                maxSum += arr.get(i);
                break;
            }
            minSum += arr.get(i);
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(2, 1, 2, 4, 5));
    }
}
