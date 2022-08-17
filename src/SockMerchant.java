import java.util.HashMap;
import java.util.List;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> pairs = new HashMap<>();

        ar.forEach(s -> {
            if (pairs.containsKey(s)) {
                pairs.put(s, (pairs.get(s) + 1));
            } else {
                pairs.put(s, 1);
            }
        });

        int result = 0;
        // This is to group how many socks you want
        int countSocksInPair = 2;

        for (Integer count : pairs.values()) {
            result += (count / countSocksInPair);
        }
        return result;
    }
}
