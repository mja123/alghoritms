package codeSignal.core.lvl1;

public class MaxMultiple {
    int solution(int divisor, int bound) {
        int largest = 0;

        for (int i = 1; i <= bound; i++) {
            if (i % divisor == 0) {
                largest = i;
            }
        }
        return largest;
    }
}
