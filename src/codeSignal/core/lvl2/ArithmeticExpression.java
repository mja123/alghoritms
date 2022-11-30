package codeSignal.core.lvl2;

public class ArithmeticExpression {
    boolean solution(int a, int b, int c) {
        return a + b == c || a - b == c || a * b == c || a / b == c && a % b == 0;
    }

}
