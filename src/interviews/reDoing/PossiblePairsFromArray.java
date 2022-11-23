package interviews.reDoing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PossiblePairsFromArray {
    /* 5- A function called pairs() takes an array, for example [3,1,8].
It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
Implement it please*/
    public static Integer[][] pairs(int[] numbers) {
        List<List<Integer>> formedPairs = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                List<Integer> pair = new LinkedList<>();

                pair.add(numbers[i]);
                pair.add(numbers[j]);

                formedPairs.add(pair);
            }
        }

        List<Integer[]> objects = formedPairs.stream().map(l -> l.toArray(l.toArray(new Integer[0]))).toList();
        Integer[][] result = new Integer[objects.size()][objects.get(0).length];

        int i = 0;
        for(Integer[] object : objects) {
            result[i++] = object;
        }

        return result;
    }

    public static void main(String[] args) {
        pairs(new int[]{3,1,8});
        Arrays.stream(pairs(new int[]{3,1,8}))
                .forEach(l -> {
                    Arrays.stream(l).forEach(n -> System.out.print(n + " "));
                    System.out.println(" ");
                });
    }
}
