package codeSignal.arcade.lvl6;

public class ArrayReplace {
    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] answer = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            answer[i] = (inputArray[i] == elemToReplace) ? substitutionElem : inputArray[i];
        }
        return answer;
    }
}
