package codeSignal.companyChallenges.dropbox;

import java.util.HashMap;
import java.util.Map;

public class CampusCup {
    String[] solution(String[] emails) {

        Map<String, Integer> points = new HashMap<>();

        for (String email : emails) {
            String currentDomain = email.split("@")[1];

            if (points.containsKey(currentDomain)) {
                points.put(currentDomain, points.get(currentDomain) + 1);
            } else {
                points.put(currentDomain, 1);
            }
        }

        Integer storage = null;

        for (Map.Entry<String, Integer> institute : points.entrySet()) {
            Integer currentValue = institute.getValue();
            if (storage == null) {
                storage = currentValue;

            } else {
                if (currentValue.equals(storage) || currentValue < 1  || (storage == 5 && currentValue >= 3 && currentValue <= 5)) {
                    return points.keySet().stream().sorted().toArray(String[]::new);
                }
            }
        }

        return points.keySet().toArray(String[]::new);

    }

}
