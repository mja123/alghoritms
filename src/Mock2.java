import java.util.Comparator;
import java.util.List;

public class Mock2 {
    public static int flippingMatrix(List<List<Integer>> matrix) {

        int result = 0;
        Integer max = 0;
        for (int i = 0; i < matrix.size(); i++) {
          matrix.get(i).sort(Comparator.reverseOrder());
          for (int j = 0; j < matrix.size(); j++) {
            max = matrix.get(i).stream().max(Comparator.naturalOrder()).get();
            matrix.get(i).remove(max);
            result += max;
          }
         }
        return result;
    }
  public static void main(String[] args) {

  }
}
