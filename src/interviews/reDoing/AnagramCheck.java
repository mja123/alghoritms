package interviews.reDoing;

import java.util.*;

public class AnagramCheck {

    public static boolean hashMapSolution(String word, String target) {
        //O(2n)
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
                if (letters.get(letter) > 1) {
                    letters.put(letter, letters.get(letter) - 1);
                } else {
                    letters.remove(letter);
                }
            }
        }
        return letters.isEmpty();
    }

    public static boolean arraysSolution(String word, String target) {
        char[] wordChars= word.toCharArray();
        char[] targetChars = target.toCharArray();

        //O(2n log(n))
        Arrays.sort(wordChars);
        Arrays.sort(targetChars);

        return Arrays.equals(wordChars, targetChars);
    }

    public static boolean stringBuilderSolution(String word, String target) {
        StringBuilder targetBuilder = new StringBuilder(target);

        for(Character letter : word.toCharArray()) {
            int characterIndex = targetBuilder.indexOf(String.valueOf(letter));

            if (characterIndex != -1) {
                targetBuilder.deleteCharAt(characterIndex);
            } else {
                return false;
            }
        }

        return targetBuilder.isEmpty();
    }

    public static void main(String[] args) {
        String word = "anagrama";
        String target = "anrgamaa";

        //System.out.println(hashMapSolution(word, target));
        //System.out.println(arraysSolution(word, target));
        System.out.println(stringBuilderSolution(word, target));
    }
}
