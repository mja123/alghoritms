package codeSignal.arcade.lvl3;
//https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM/solutions
public class SortByHeight {
    int[] solution(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == - 1) || (a[j] == - 1)) {
                    continue;
                }
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
