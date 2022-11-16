package codeSignal.interview.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    int solution(int[] a) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < a.length; i++) {

            if (numbers.contains(a[i])) {
                return a[i];
            }
            numbers.add(a[i]);
        }
        return -1;

    }
}
