package codeSignal.arcade.lvl6;

public class AlphabetShift {
    static String solution(String inputString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char letter = inputString.charAt(i);

            if (letter == 'z') {
                answer.append('a');
            } else {
                answer.append(Character.toChars(inputString.charAt(i) + 1));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String input = "crazy";
        System.out.println(solution(input));
    }
}
