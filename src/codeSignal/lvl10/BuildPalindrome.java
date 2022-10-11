package codeSignal.lvl10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class BuildPalindrome {
    static String solution(String st) {
        StringBuilder lettersAdded = new StringBuilder(st);

        if (lettersAdded.reverse().toString().equals(st)) {
            return st;
        }
        lettersAdded.reverse();
        for (int i = 0; i < st.length(); i++) {
            for (int j = st.length() - 1; j > i; j--) {
                if (j != st.indexOf((st.charAt(j)))) {
                    continue;
                }
                if (st.charAt(i) == st.charAt(j)) {

                    //Add at the end the letters before i
                    if (i > (st.length() / 2) - 1) {


                        lettersAdded.append(new StringBuilder(st.subSequence(0, i)).reverse());
                        //Add at the begining the letters before j
                    } else {
                        lettersAdded.insert(0, new StringBuilder(st.subSequence(j, st.length())).reverse());
                    }
                    return lettersAdded.toString();
                }
            }
        }
        return lettersAdded.append(new StringBuilder(st.substring(0, st.length() - 1)).reverse()).toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("ababab"));
    }
}
