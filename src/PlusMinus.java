import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        float positives = 0;
        float zeros = 0;
        float negatives = 0;

        for (Integer number : arr) {
            if(number > 0) {
                positives++;
            } else if(number < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.printf("%1.6f ", positives / arr.size());
        System.out.printf("\n%1.6f ", negatives / arr.size());
        System.out.printf("\n%1.6f ", zeros / arr.size());
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }
}
