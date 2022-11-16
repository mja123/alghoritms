package codeSignal.arcade.lvl10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BeautifulString {
    static boolean solution(String inputString) {
        Map <Character, Integer> letters = new HashMap<>();

        for(char letter : inputString.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        Set<Character> uniqueLetters = new HashSet<>();

        for (char letter : inputString.toCharArray()) {

            char previousLetter = (char) (letter - 1);

            if (uniqueLetters.contains(letter) || (letter == 'a')) {
                continue;
            }

            if ((!letters.containsKey(previousLetter)) || (letters.get(letter) > letters.get(previousLetter))) {
                return false;
            }

            uniqueLetters.add(letter);
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("bbbaacdafe"));
    }
}
