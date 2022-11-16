package codeSignal.arcade.lvl9;

public class LongestDigitPrefix {
    String solution(String inputString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                result.append(inputString.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

}
