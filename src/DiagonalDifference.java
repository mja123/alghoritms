import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rows = arr.size();
        Integer mainDiagonal = 0;
        Integer secondaryDiagonal = 0;


        for (int i = 0; i < rows; i++) {
            mainDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(rows - 1 - i);
        }

        return Math.abs((mainDiagonal - secondaryDiagonal));
    }

  public static void main(String[] args) {
      List<List<Integer>> mainList = new ArrayList<>();

      List<Integer> intList = Arrays.asList(11, 2, 4);
      mainList.add(intList);
      List<Integer> intList1 = Arrays.asList(4, 5, 6);
      mainList.add(intList1);
      List<Integer> intList2 = Arrays.asList(10, 8, -12);
      mainList.add(intList2);
      /*11 2 4
      4 5 6
      10 8 -12*/
      System.out.println(diagonalDifference(mainList));

  }

}
