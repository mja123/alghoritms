import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mock1 {
    public static int findMedian(List<Integer> arr) {
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        return sorted.get((sorted.size() / 2));
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(52);
        arr.add(3);
        arr.add(1234);
        arr.add(2323);
        arr.add(23423);
        arr.add(0);
        arr.add(2);

        System.out.println(findMedian(arr));
    }
}
