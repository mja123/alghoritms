package codeSignal.interview.arrays;

public class FirstNotRepeatingCharacter {
    char solution(String s) {

        char firstUnique = '_';
        for (char letter : s.toCharArray()) {
            if (s.indexOf(letter) == s.lastIndexOf(letter)) {
                firstUnique = letter;
                break;
            }
        }
        return firstUnique;
    }

}
