package interviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MartinInterview {
    /*
    # Imagine we have an image. We’ll represent this image as a simple 2D array where every pixel is a 0 or a 1. The image you get is known to have a rectangle of 0s on a background of 1s.
       # Write a function that takes in the image and returns a data structure that contains the coordinates of the rectangle. (e.g. top-left & bottom-      right, or top-left & width & height, etc.)
       # {x: 3, y: 2, width: 3, height: 2}
       # [2, 3, 3, 5]
       # 2 3 3 5
    image = [
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 0, 0, 0, 1, 1, 0, 1],
  [1, 1, 1, 0, 0, 0, 1, 1, 0, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 0, 1],
];
     */
    public static List<Integer> solution(int[][] matrix) {

        List<Integer> coordinates = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> currentMatrix = checkZeroSubMatrix(matrix, i, j);
                    if (coordinates.isEmpty()) {
                        coordinates = currentMatrix;
                        continue;
                    }
                    int currentSize = currentMatrix.get(2) + currentMatrix.get(3);
                    int biggestSize = coordinates.get(2) + coordinates.get(3);

                    if (currentSize > biggestSize) {
                        coordinates = currentMatrix;
                    }
                }
            }
        }
        return coordinates;
    }


    private static List<Integer> checkZeroSubMatrix(int[][] matrix, int i, int j) {
        List<Integer> subMatrixCoordinates = new ArrayList<>();


        subMatrixCoordinates.add(i);
        subMatrixCoordinates.add(j);


        for (int row = j; row < matrix[i].length; row++) {
            if (matrix[i][row] == 1) {
                subMatrixCoordinates.add(row - j);
                break;
            }
            if (matrix[0].length - 1 == j) {
                subMatrixCoordinates.add(row - j + 1);
                break;
            }
        }

        for (int col = i; col < matrix.length; col++) {
            if (matrix[col][j] == 1) {
                subMatrixCoordinates.add(col - i);
                break;
            }
            if (col == matrix.length - 1) {
                subMatrixCoordinates.add(col - i + 1);
                break;
            }
        }
        return subMatrixCoordinates;
    }

    public static void main(String[] args) {
        int[][] matrix =   {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
        };
//        int[][] matrix =   {
//                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
//                {1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
//                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
//        };
        solution(matrix).forEach(System.out::println);
    }
}
