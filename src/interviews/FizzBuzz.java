package interviews;

public class FizzBuzz {
    public static String[] solution(int[] numbers) {
        String[] numbersChanged = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                numbersChanged[i] = "FizzBuzz";
            } else if (numbers[i] % 3 == 0) {
                numbersChanged[i] = "Fizz";
            } else if (numbers[i] % 5 == 0) {
                numbersChanged[i] = "Buzz";
            } else {
                numbersChanged[i] = String.valueOf(numbers[i]);
            }
        }
        return numbersChanged;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 9, 15, 30};

        String[] result = solution(numbers);

        for (String element : result) {
            System.out.println(element);
        }
    }
}
