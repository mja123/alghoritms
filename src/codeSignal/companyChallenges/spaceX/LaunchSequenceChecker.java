package codeSignal.companyChallenges.spaceX;

import java.util.HashMap;
import java.util.Map;

public class LaunchSequenceChecker {
    boolean solution(String[] systemNames, int[] stepNumbers) {
        Map<String, Integer> systemSteps = new HashMap<>();

        for (int i = 0; i < stepNumbers.length; i++) {
            if (systemSteps.containsKey(systemNames[i])) {
                if (stepNumbers[i] <= systemSteps.get(systemNames[i])) {
                    return false;
                }
            }
            systemSteps.put(systemNames[i], stepNumbers[i]);
        }
        return true;
    }
    //Time complexity O(n)
}
