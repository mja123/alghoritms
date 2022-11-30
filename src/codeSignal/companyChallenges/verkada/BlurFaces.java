package codeSignal.companyChallenges.verkada;

public class BlurFaces {
    static double[][] solution(int[][] img) {
        double[][] blurredImage = new double[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                blurredImage[i][j] = blurredValue(img, i, j);
            }
        }
        return blurredImage;
    }

    static double blurredValue(int[][] img, int i, int j) {

        if (i - 1 >= 0) {

        }
        for (int k = i - 1; k < i + 2; k += 2) {
            for (int l = j - 1; l < j + 2; l += 2) {

            }
        }
        double neighborsSum = 0;
        int neighborsCount = 0;

        if (i + 1 < img.length) {
            neighborsSum += img[i + 1][j];
            neighborsCount ++;

            if (j + 1 < img[i + 1].length) {
                neighborsSum += img[i + 1][j + 1];
                neighborsCount ++;
            }
            if (j - 1 >= 0) {
                neighborsSum += img[i + 1][j - 1];
                neighborsCount ++;
            }
        }
        if (i - 1 >= 0) {
            neighborsSum += img[i - 1][j];
            neighborsCount ++;

            if (j + 1 < img[i - 1].length) {
                neighborsSum += img[i - 1][j + 1];
                neighborsCount ++;
            }
            if (j - 1 >= 0) {
                neighborsSum += img[i - 1][j - 1];
                neighborsCount ++;
            }
        }
        if (j + 1 < img[i].length) {
            neighborsSum += img[i][j + 1];
            neighborsCount ++;

        }
        if (j - 1 >= 0) {
            neighborsSum += img[i][j - 1];
            neighborsCount ++;
        }
        return neighborsCount != 0 ? neighborsSum / neighborsCount : img[i][j];
    }

    public static void main(String[] args) {
        int[][] img = {{2, 8},
                {50, 5},
                {4, 52},
                {50, 2},
                {9, 4},
                {10, 4},
                {4, 4},
                {77, 5},
                {22, 3}};
        solution(img);
    }
}
