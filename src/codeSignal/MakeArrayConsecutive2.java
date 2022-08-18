package codeSignal;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    //https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC/solutions
    int solution(int[] statues) {
        /* best solution
        Arrays.sort(statues);
        int n = statues[statues.length-1] - statues[0];
        return n - statues.length + 1;*/
        return Arrays.stream(statues).max().getAsInt() - (Arrays.stream(statues).min().getAsInt() + statues.length) + 1;
    }

}
