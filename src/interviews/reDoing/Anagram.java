package interviews.reDoing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean solution(String word1, String word2) {
        Map<Character, Integer> letters = new HashMap<>();

        if (word1.length() != word2.length()) {
            return false;
        }
        word2 = word2.toLowerCase();
        word1 = word1.toLowerCase();

        for (Character letter : word1.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            Character currentLetter = word2.charAt(i);

            if (!letters.containsKey(currentLetter)) {
                return false;
            }

            if (letters.get(currentLetter) > 1) {
                letters.put(currentLetter, letters.get(currentLetter) - 1);
            } else {
                letters.remove(currentLetter);
            }
        }
        return letters.isEmpty();
    }

    public static boolean solution2 (String word1, String word2) {
        return word1
                .toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString()
                .equals(word2
                        .toLowerCase()
                        .chars()
                        .sorted()
                        .collect(StringBuilder::new,
                                StringBuilder::appendCodePoint,
                                )
                        .toString());


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        String word1 = "Anagram";
        String word2 = "aanrgam";

        System.out.println(solution2(word1, word2));
    }

}
