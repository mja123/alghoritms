package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    static boolean solution(String word, String target) {

        Map<Character, Integer> letters = new HashMap<>();

        for (Character letter : word.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (Character letter : target.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) - 1);

                if (letters.get(letter) == 0) {
                    letters.remove(letter);
                }

            }  else {
                return false;
            }
        }
        return letters.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("car", "rat"));
        System.out.println(solution("stressed", "dessert"));
        System.out.println(solution("bad credit", "credit card"));

    }
}
