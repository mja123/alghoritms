package interviews;

import java.util.HashMap;
import java.util.Map;

public class CountLetter {

    public static void solution(String word) {
        Map<Character, Integer> letters = new HashMap<>();

//        Without spaces
//        word = word.replace(" ", "");

        for (Character letter : word.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        letters.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
    public static void main(String[] args) {
        solution("This sentence is reaaaaally huge");

    }
}
