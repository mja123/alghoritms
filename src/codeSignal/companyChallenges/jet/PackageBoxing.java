package codeSignal.companyChallenges.jet;

import java.util.Arrays;

public class PackageBoxing {
    int solution(int[] pkg, int[][] boxes) {
        Arrays.sort(pkg);
        int[] boxVolume = new int[2];
        boolean boxDoesnotFit = true;

        for (int i = 0; i < boxes.length; i++) {
            Arrays.sort(boxes[i]);
            for (int j = 0; j < boxes[i].length; j++) {
                if (boxes[i][j] < pkg[j]) {
                    break;
                }
                if (j == boxes[i].length - 1) {
                    boxDoesnotFit = false;
                    int currentVolume = Arrays.stream(boxes[i]).reduce(1, (c,n) -> c * n);

                    if (boxVolume[1] == 0) {
                        boxVolume[0] = i;
                        boxVolume[1] = currentVolume;
                    }
                    if (currentVolume < boxVolume[1]) {

                        boxVolume[0] = i;
                        boxVolume[1] = currentVolume;
                    }
                }
            }
        }
        return boxDoesnotFit ? -1 : boxVolume[0];
    }

}
