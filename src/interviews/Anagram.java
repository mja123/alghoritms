package interviews;
//6:04
//6:09

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    private static boolean solution (String word, String target) {
        Map<Character, Integer> letters = new HashMap<>();

        for(Character letter : word.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (int i = 0; i < target.length(); i++) {
            Character currentLetter = target.charAt(i);
            if (letters.containsKey(currentLetter)) {
                letters.put(currentLetter, letters.get(currentLetter) - 1);

                if (letters.get(currentLetter) == 0) {
                    letters.remove(currentLetter);
                }
            }

        }
        return letters.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("ate", "eta"));
        System.out.println(solution("abcdefgh", "hgfedcba"));
        System.out.println(solution("this is an anagram", "margana na si siht"));
        System.out.println(solution("This is not an anagram", "margana an ton si siht"));
    }

}
