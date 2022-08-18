package hackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Pangram {
    //A pangram is a string that contains all the alphabet's letters.
    public static String pangrams(String s) {
        s = s.toLowerCase(Locale.ROOT);
        Set<Character> letters = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) {
                continue;
            }
            if(String.valueOf(s.charAt(i)).matches("[a-z]")) {
                letters.add(s.charAt(i));
            }
        }
        if (letters.size() == 26) {
            return "pangram";
        }
        return "not pangram";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
