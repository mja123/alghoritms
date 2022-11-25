package codeSignal.companyChallenges.asana;

public class TaskTypes {
    int[] solution(int[] deadlines, int day) {
        int[] taskOrder = new int[3];

        for (int currentDeadline : deadlines) {
            if (currentDeadline <= day) {
                taskOrder[0]++;
            } else if (currentDeadline <= day + 7) {
                taskOrder[1]++;
            } else {
                taskOrder[2]++;
            }
        }
        return taskOrder;
    }

}
