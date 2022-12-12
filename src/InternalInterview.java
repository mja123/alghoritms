import java.util.Arrays;

public class InternalInterview {
    private static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {

                    int temporary = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temporary;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 2, 0};

        Arrays.stream(solution(numbers)).forEach(System.out::println);
    }
}