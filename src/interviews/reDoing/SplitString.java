package interviews.reDoing;

import java.util.Arrays;

/* 4- String asdfGGkjcl, split it on the doubled symbol and print length of both strings*/
public class SplitString {
    public static void solution(String word) {
        //Hardcoding way
        //Arrays.stream(word.split("GG")).forEach(g -> System.out.println(g.length()));
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                System.out.println(word.substring(0, i).length());
//i + 2 because substring include the beginIndex (i + 1 == second symbol && i + 2 == first character after doble symbol)
                System.out.println(word.substring(i + 2).length());
                break;
            }
        }
    }

    public static void main(String[] args) {
        solution("asdfGGkjcl");
    }
}
