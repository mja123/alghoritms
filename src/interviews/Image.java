package interviews;

import java.util.ArrayList;
import java.util.List;

/*
# Imagine we have an image. We’ll represent this image as a simple 2D array where every pixel is a 0 or a 1.
    The image you get is known to have a rectangle of 0s on a background of 1s.
# Write a function that takes in the image and returns a data structure that contains the coordinates of the rectangle.
    (e.g. top-left & bottom-right, or top-left & width & height, etc.)
# {x: 3, y: 2, width: 3, height: 2}
# [2, 3, 3, 5]
# 2 3 3 5
image = [
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 0, 0, 0, 1],
  [1, 1, 1, 0, 0, 0, 1],
  [1, 1, 1, 1, 1, 1, 1],
];
Second task was the same but with more rectangles of 0s, something like this
image = [
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 0, 0, 0, 1, 1, 0, 1],
  [1, 1, 1, 0, 0, 0, 1, 1, 0, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 0, 1],
];

  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 0, 0, 0, 0, 1, 1, 1],
  [1, 1, 1, 0, 1, 0, 0, 1, 0, 1],
  [1, 1, 1, 0, 0, 0, 0, 1, 0, 1],
  [1, 1, 1, 0, 0, 1, 1, 1, 0, 1],

      (1 - 3 = -2) >= 2 -> k  = i   1 - 4 = -3 >= 2 -> l = j
  if (k - rows >= rows / 2               l - columns >= columns / 2
  [0, 0, 0, 0, 0],
  [0, 1, 0, 0, 0],
  [0, 0, 0, 0, 0],
  [0, 1, 0, 0, 0],

  [0, 0, 0, 0, 0],
  [0, 1, 0, 1, 0],
  [0, 0, 0, 1, 0],
  [0, 0, 0, 0, 0],

  [0, 0, 0],
  [0, 0, 0],
  [0, 1, 0],

    static int[][] image = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
            {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
    };
 */
public class Image {
    public static List<Integer> solution(int[][] image) {
        List<Integer> biggerRectangle = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                // Enter only if the 0 didn't be analyzed
                if ((image[i][j] == 0) && (biggerRectangle.isEmpty() || ((biggerRectangle.get(2) <= i) && (biggerRectangle.get(3) <= j)))) {

                    List<Integer> currentRectangle = evaluateContext(image, i, j);
                    int currentZerosRectangle =  currentRectangle.get(2) - currentRectangle.get(0) + currentRectangle.get(3) - currentRectangle.get(1);
                    int mostZerosRectangle = biggerRectangle.isEmpty() ? 0 : biggerRectangle.get(2) - biggerRectangle.get(0) + biggerRectangle.get(3) - biggerRectangle.get(1);

                // Compare count of zeros in the rectangle
                    if (currentZerosRectangle > mostZerosRectangle) {
                        biggerRectangle = currentRectangle;
                    }
                }
            }
        }
        return biggerRectangle;
    }

    private static List<Integer> evaluateContext (int[][] image, int i, int j) {
        List<Integer> rectangleAnalyzed = new ArrayList<>();

        //Adding the initial coordinates
        rectangleAnalyzed.add(i);
        rectangleAnalyzed.add(j);

        // By default, the rows in the matrix ends with 0
        int rowSizeOfZeros =  image.length - 1;
        // Adding the last zero in the row
        for (int k = i; k < image.length; k++) {
            if (image[k][j] != 0) {
                rowSizeOfZeros = k - 1;
                break;
            }
        }

        // By default, the columns in the matrix ends with 0
        int columnSizeOfZeros = image[0].length - 1;
        //A dding the last zero in the column
        for (int k = j; k < image[0].length; k++) {
            if (image[i][k] != 0) {
                columnSizeOfZeros = k - 1;
                break;
            }
        }
//Trying to detect 1s inside the sub matrix
//        // Check the if the elements inside the sub matrix are all zeros
//        for (int k = i; k < rowSizeOfZeros; k++) {
//            for (int l = j; l < columnSizeOfZeros; l++) {
//                //If an element in the sub matrix is 1
//                if (image[k][l] != 0) {
//                    // To check if we need to analyze a sub matrix
//                    boolean haveToRestart = false;
//                    // If exist the possibility of find a bigger sub matrix (more elements to iterate than the matrix half)
//                    if ((columnSizeOfZeros - k) >= (columnSizeOfZeros / 2)) {
//                        haveToRestart = true;
//                        i = k + 1;
//                    }
//                    if ((rowSizeOfZeros - l) >= (rowSizeOfZeros / 2)) {
//                        haveToRestart = true;
//                        j = l + 1;
//                    }
//                    if (haveToRestart) {
//                        // Restart the analysis with the new sub matrix
//                        return evaluateContext(image, i, j);
//                    }
//                }
//            }
//        }

        rectangleAnalyzed.add(rowSizeOfZeros);
        rectangleAnalyzed.add(columnSizeOfZeros);
        return rectangleAnalyzed;
    }

    public static void main(String[] args) {
//      int[][]image = {
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 0, 0, 0, 1},
//                {1, 1, 1, 0, 0, 0, 1},
//                {1, 1, 1, 1, 1, 1, 1}};

      int[][] image = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
        };
//        int[][] image = {
//                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 0, 0, 0, 0, 1, 1, 1},
//                {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
//                {1, 1, 1, 0, 0, 0, 0, 1, 0, 1},
//                {1, 1, 1, 0, 0, 1, 1, 1, 0, 1}
//
//        };


        solution(image).forEach(System.out::println);
    }
}
