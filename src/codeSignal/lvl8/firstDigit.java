package codeSignal.lvl8;

public class firstDigit {
    char solution(String inputString) {
        for (char character : inputString.toCharArray()) {
            if (Character.isDigit(character)) {
                return character;
            }
        }
        return inputString.charAt(inputString.length() - 1);
    }
}
