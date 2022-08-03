import java.util.*;
import java.util.stream.IntStream;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int maxElement = arr.stream().max(Comparator.naturalOrder()).get();

        List<Integer> result = new ArrayList<>();


        while (maxElement + 1 != 0) {
            result.add(0);
            maxElement--;
        }

        for (Integer number : arr) {
            result.set(number, result.get(number) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
    System.out.println(countingSort(Arrays.asList(1, 2, 3, 4, 1, 1, 2, 3, 0, 4)));

  }
}
