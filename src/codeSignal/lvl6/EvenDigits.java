package codeSignal.lvl6;

public class EvenDigits {
    /*Better solution:
    return Integer.toString(n).matches("(0|2|4|6|8)*");
    */
    boolean solution(int n) {
        char[] numbers = String.valueOf(n).toCharArray();

        for (char digit : numbers) {
            if ((Integer.parseInt(String.valueOf(digit)) % 2) != 0) return false;
        }
        return true;
    }
}
