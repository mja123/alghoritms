package hackerRank;

import java.util.Comparator;
import java.util.List;

public class PermutingArrays {
    //https://www.hackerrank.com/challenges/one-month-preparation-kit-two-arrays/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(Comparator.naturalOrder());
        B.sort(Comparator.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }
}
