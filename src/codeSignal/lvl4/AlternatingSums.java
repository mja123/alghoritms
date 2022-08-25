package codeSignal.lvl4;

public class AlternatingSums {
    int[] solution(int[] a) {

        int[] answer = {0, 0};

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                answer[0] += a[i];
            } else {
                answer[1] += a[i];
            }
        }
        return answer;
    }

}
