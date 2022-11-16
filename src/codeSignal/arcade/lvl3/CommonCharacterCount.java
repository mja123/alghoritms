package codeSignal.arcade.lvl3;
//https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {
    int solution(String s1, String s2) {
        Map<Character, Integer> repeatedLetters = new HashMap<>();
        int result = 0;

        for (Character letter : s1.toCharArray()) {
            if (!s2.contains(letter.toString())) {
                continue;
            }

            if (repeatedLetters.containsKey(letter)) {
                //if the char's index is not the last char in the string, creates a new temporary string since that index
                //to compare if that char is again repeated in the string
                if (repeatedLetters.get(letter) != s2.length() - 1) {
                    String subS2 = s2.substring(repeatedLetters.get(letter) + 1);
                    if (subS2.contains(letter.toString())) {
                        repeatedLetters.put(letter, subS2.indexOf(letter.toString()));
                        result++;
                    }
                }
            } else {
                repeatedLetters.put(letter, s2.indexOf(letter.toString()));
                result++;
            }
        }

        return result;
    }

    /*better solution:
        int solution(String s1, String s2) {
        int counter = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
        }*/
}


