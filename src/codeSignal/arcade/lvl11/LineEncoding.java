package codeSignal.arcade.lvl11;

public class LineEncoding {
    String solution(String s) {
        StringBuilder encodingString = new StringBuilder();

        int letterCounter = 1;
        for (int i = 0; i < s.length(); i++) {

            if (i != s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    letterCounter++;
                    continue;

                } else {
                    addLetters(encodingString, letterCounter, s.charAt(i));

                }
            } else {
                addLetters(encodingString, letterCounter, s.charAt(i));
            }

            letterCounter = 1;
        }

        return encodingString.toString();
    }

    void addLetters(StringBuilder encoding, int counter, char letter) {

        if (counter == 1) {
            encoding.append(letter);
        } else {
            encoding.append(counter).append(letter);
        }
    }
}
