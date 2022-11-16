package codeSignal.interview.arrays;

public class RotateImage {
    int[][] solution(int[][] a) {

        int[][] rotated = new int[a.length][a.length];

        int k = a.length - 1;
        int l = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                rotated[j][k] = a[l][j];
            }
            k--;
            l++;
        }
        return rotated;
    }

}
