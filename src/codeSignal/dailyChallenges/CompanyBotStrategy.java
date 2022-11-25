package codeSignal.dailyChallenges;

import java.util.ArrayList;
import java.util.List;

public class CompanyBotStrategy {
    double solution(int[][] trainingData) {
        List<Integer> timeCorrectAnswer = new ArrayList<>();

        for(int[] tuple : trainingData) {
            if (tuple[1] == 1) {
                timeCorrectAnswer.add(tuple[0]);
            }
        }

        if (timeCorrectAnswer.isEmpty()) {
            return 0.0;
        }

        return (timeCorrectAnswer.stream().reduce(Integer::sum).get() / (double) timeCorrectAnswer.size());
    }

}
