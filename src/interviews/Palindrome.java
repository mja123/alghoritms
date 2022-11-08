package interviews;

import java.util.HashMap;
import java.util.Map;

/*
4. given two strings , return true if they are palindromes.
I did in 2 different way, but they want the answer using hash, since the complexity is lower
 */
public class Palindrome {
    public static boolean solution(String word, String target) {

        return new StringBuilder(word).reverse().toString().equals(target);
    }

    public static boolean solution2(String word, String target) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (!(word.charAt(i) == target.charAt(target.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("palindrome", "emordnilap"));
    }
}
