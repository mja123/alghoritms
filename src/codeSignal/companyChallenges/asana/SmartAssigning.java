package codeSignal.companyChallenges.asana;

public class SmartAssigning {
    String solution(String[] names, boolean[] statuses, int[] projects, int[] tasks) {

        int[] highestAvailability = new int[2];
        String highestName = "";

        for (int i = 0; i < names.length; i++) {
            if (statuses[i]) {
                continue;
            }
            if (highestAvailability[0] == 0) {
                highestName = names[i];
                highestAvailability = new int[]{tasks[i], projects[i]};
                continue;
            }

            if (tasks[i] < highestAvailability[0]) {
                highestName = names[i];
                highestAvailability = new int[]{tasks[i], projects[i]};
            } else if (tasks[i] == highestAvailability[0]) {

                if (projects[i] < highestAvailability[1]) {
                    highestAvailability = new int[]{tasks[i], projects[i]};
                    highestName = names[i];
                }
            }
        }
        return highestName;
    }
}
