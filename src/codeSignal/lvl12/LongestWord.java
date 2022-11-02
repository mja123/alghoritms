package codeSignal.lvl12;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    String solution(String text) {
        String[] words = text.split("[^a-zA-Z]");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
