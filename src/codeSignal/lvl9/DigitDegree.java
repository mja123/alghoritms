package codeSignal.lvl9;

public class DigitDegree {
    static int solution(int n) {
        if (n < 10) {
            return 0;
        }

        String input = String.valueOf(n);
        int counter = 0;
        int digit;

        do {
            digit = 0;
            for (int i = 0; i < input.length(); i++) {
                digit += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            input = String.valueOf(digit);
            counter++;

        } while(digit >= 10);
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(solution(91));
    }
}
