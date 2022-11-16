package codeSignal.arcade.lvl4;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    /*
    A better solution:
    boolean solution(String inputString) {
    Set<Character> chars = new HashSet<Character>();

    for (int i = 0; i < inputString.length();  ++i) {
        char c = inputString.charAt(i);
        if (chars.contains(c)) {
            chars.remove(c);
        }
        else {
            chars.add(c);
        }
    }
    return chars.size() <= 1;
}

     */
    boolean solution(String inputString) {
        Map<Character, Integer> letters = new HashMap<>();
        int oddLetters = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (letters.containsKey(inputString.charAt(i))) {
                letters.put(inputString.charAt(i), letters.get(inputString.charAt(i)) + 1);
            } else {
                letters.put(inputString.charAt(i), 1);
            }
        }

        for(Integer letter : letters.values()) {
            if (letter % 2 != 0) {
                oddLetters ++;
            }
        }

        return oddLetters <= 1;
    }
}
