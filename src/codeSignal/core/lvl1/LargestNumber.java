package codeSignal.core.lvl1;

public class LargestNumber {
    int solution(int n) {
        String maxDigit = "9";
        return Integer.parseInt(maxDigit.repeat(n));
    }
}
