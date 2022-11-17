package codeSignal.core.lvl1;

public class PhoneCall {
    int solution(int min1, int min2_10, int min11, int s) {
        if (s < min1) {
            return 0;
        }

        int budget = s - min1;

        if (budget < min2_10) {
            return 1;
        }

        budget -= (min2_10 * 9);

        if (budget < min11) {
            if (budget >= 0) {
                return 10;
            }
            return 1 + (budget + (min2_10 * 9)) / min2_10;
        }

        return 10 + (budget / min11);
    }
}
