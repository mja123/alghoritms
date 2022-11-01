package codeSignal.lvl11;

public class DeleteDigit {
    int solution(int n) {
        String stringNumber = String.valueOf(n);

        int maxNumber = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            int currentNumber = Integer.parseInt(stringNumber.replaceFirst(String.valueOf(stringNumber.charAt(i)), ""));

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        return maxNumber;

    }

}
