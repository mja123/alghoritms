package codeSignal.arcade.lvl8;

import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {
    int solution(String s) {
        Set<Character> letters = new HashSet<>();

        for (char letter : s.toCharArray()) {
            if (letters.contains(letter)) {
                continue;
            }
            letters.add(letter);
        }
        return letters.size();
    }
}
