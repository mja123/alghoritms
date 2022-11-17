package codeSignal.core.lvl1;

public class CircleOfNumbers {
    int solution(int n, int firstNumber) {
        int firstNumberPlusMiddle = n / 2 + firstNumber;

        return firstNumberPlusMiddle >= n ? firstNumberPlusMiddle - n : firstNumberPlusMiddle;
    }
}
