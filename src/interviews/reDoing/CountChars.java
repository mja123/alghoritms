package interviews.reDoing;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void solution(String sentence) {
        Map<Character, Integer> letters = new HashMap<>();

        for(Character letter : sentence.toCharArray()) {
            if ((int)letter == 32) {
                continue;
            }
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        letters.forEach((k,v) -> System.out.println(k + " = " + v));
    }

    public static int lettersCount(String sentence) {
        return sentence.replace(" ", "").length();
    }

    public static void main(String[] args) {
        String sentence = "pedro perez perino pinta preciosos paisajes para poder partir para paris";
        //solution(sentence);
        System.out.println(lettersCount(sentence));

    }
}
