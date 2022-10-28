package interviews;

import java.util.Arrays;

public class Move0ToEnd {
    static int[] solution(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == 0) {
                    int auxiliary = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = auxiliary;
                }
            }
        }
        Arrays.stream(numbers).forEach(System.out::println);
        return numbers;
    }

    public static void main(String[] args) {

        int[] numbers = {0, 0, 12, 0, 15, 0};
        solution(numbers);
    }
}
