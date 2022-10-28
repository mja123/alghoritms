package interviews;

public class DigitsIncrement {
    static int[] solution(int[] number) {

        if (number[number.length - 1] < 9) {
            number[number.length - 1] += 1;
            return number;
        }

        for (int i = number.length - 1; i > 0; i--) {
            if (number[i] == 9 || number[i] == 10) {
                number[i] = 0;
                number[i - 1] += 1;
            }
        }
        if (number[0] == 10) {

            number[0] = 0;

            int[] digitAdded = new int[number.length + 1];
            digitAdded[0] = 1;

            System.arraycopy(number, 0, digitAdded, 1, number.length);
            return digitAdded;
        }
        return number;
    }
    public static void main(String[] args) {
        int[] digits = {9,9,9};

        int[] result = solution(digits);
        for (int number : result) {
            System.out.println(number);
        }

    }
}
