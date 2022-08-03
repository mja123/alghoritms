import java.sql.Array;
import java.util.*;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        ArrayList<Integer> numbers = new ArrayList<>();


        for (Integer number : a) {
            if (numbers.contains(number)) {
                numbers.remove(number);
            } else {
                numbers.add(number);
            }

        }
        return numbers.get(0);
    }

    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 2, 3, 1, 7)));
    }
}
