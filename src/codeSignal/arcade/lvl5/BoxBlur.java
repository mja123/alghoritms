package codeSignal.arcade.lvl5;

public class BoxBlur {
    // It's not my solution, I couldn't solve it.
    int[][] solution(int[][] image) {
        int[][] result = new int[image.length-2][image[0].length-2];
        for (int i = 1; i < image.length-1; i++) {
            for (int j = 1; j < image[i].length-1; j++) {
                result[i-1][j-1] = avg(image, i, j);
            }
        }
        return result;
    }

    int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                sum += image[i][j];
            }
        }
        return sum / 9;
    }
   /*static int[][] solution(int[][] image) {
        int grade = ((image[0].length / 3) * (image[0].length / 3)) + (image[0].length % 3);
        int[][] result = new int[grade][grade];


        for (int i = 0; i < image.length; i++) {
            int sum = 0;
            for (int j = 0; j < image[i].length; j++) {
                sum += image[i][j];
            }
            result[image.length - 2 - i][image[i].length - 2 - i] = sum / 9;
        }
        return result;
    }

    public static void main(String[] args) {
       int[][] input = {{0,18,9},
                        {27,9,0},
                        {81,63,45}};
       int[][] answer = solution(input);
        for (int[] ints : answer) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }

    }*/
}
