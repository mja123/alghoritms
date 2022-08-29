package codeSignal.lvl5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AvoidObstacles {
    static int solution(int[] inputArray) {
        List<Integer> input = new ArrayList<>(Arrays.stream(inputArray).boxed().toList());
        input.sort(Comparator.naturalOrder());

        int length = input.contains(input.get(0) + 1) ? input.size(): input.get(0) + 1;

        for (int i = length; i < input.size() - 1; i++) {
            int adjacentDiff = input.get(i) - input.get(i + 1);
            if (input.contains(input.get(i) + length)) {
                length = adjacentDiff;
            } else {
                length = Math.min(adjacentDiff, length);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 9};

        System.out.println(solution(array));
    }
}
