package codeSignal.core.lvl2;

public class IsInfiniteProcess {
    boolean solution(int a, int b) {
        return b < a || (a % 2 != 0 && b % 2 == 0 || a % 2 == 0 && b % 2 != 0);
    }

}
