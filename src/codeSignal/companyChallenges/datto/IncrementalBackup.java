package codeSignal.companyChallenges.datto;

import java.util.HashMap;
import java.util.Map;

public class IncrementalBackup {
    int[] solution(int lastBackupTime, int[][] changes) {
        Map<Integer, Integer> backups = new HashMap<>();

        for (int[] change : changes) {
            if (change[0] <= lastBackupTime) {
                continue;
            }
            Integer id = change[1];
            Integer time = change[0];

            if (backups.containsKey(id)) {
                if (backups.get(id) > time) {
                    continue;
                }
            }
            backups.put(id, time);
        }

        return backups.keySet()
                        .stream()
                        .sorted()
                        .mapToInt(i -> i)
                        .toArray();
    }

}
