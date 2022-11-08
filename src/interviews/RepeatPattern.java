package interviews;
/*
    3. Given this input: "3[asdf]" you have to generate an output string: asdfasdfasdf
    # Q1
    ## input => "3[asdf]"
    ## output => "asdfasdfasdf"
    # Q2
    ## input => "3[a]4[b]"
    ## output => "aaabbbb"
    # Q3
    ## input => "3[a2[b]]"
    ## interim output => "3[abb]"
    ## output => "abbabbabb" (edited)


    \d+\[+[a-z] Matcher that matches number and letters inside
 */
public class RepeatPattern {
    public static String solution(String word) {
        StringBuilder modifiedWord = new StringBuilder(word);

        while (modifiedWord.toString().contains("[")) {
            int openBracket = modifiedWord.lastIndexOf("[");
            int closeBracket = modifiedWord.indexOf("]", openBracket);

            int repetitions = Character.getNumericValue(modifiedWord.charAt(openBracket - 1));

            String replacedPattern = modifiedWord.substring(openBracket + 1, closeBracket).repeat(repetitions);

            modifiedWord.replace(openBracket - 1, closeBracket + 1, replacedPattern);
        }

        return modifiedWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3[a2[b]]"));
    }
}
