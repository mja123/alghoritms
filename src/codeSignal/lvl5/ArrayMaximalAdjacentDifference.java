package codeSignal.lvl5;

public class ArrayMaximalAdjacentDifference {
    int solution(int[] inputArray) {

        int maxDiff = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {

            int diff = Math.abs(inputArray[i] - inputArray[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

}
