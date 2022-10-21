package interviews;
//13:05
public class CompleteWord {
    static String solution(String word) {
        StringBuilder answer = new StringBuilder(word);

        while(answer.toString().contains("[")) {

            int openBracket = answer.lastIndexOf("[");
            int closeBracket = answer.indexOf("]", openBracket);

            String bracket = answer.substring(openBracket + 1, closeBracket);
            int repetitions = Integer.parseInt(String.valueOf(answer.charAt(openBracket - 1)));

            String replacedPart = bracket.repeat(repetitions);

            answer.delete(openBracket - 1, closeBracket + 1);
            answer.insert(openBracket - 1, replacedPart);
        }

        return answer.toString();
    }



    public static void main(String[] args) {
        System.out.println(solution("3[asdf]"));
        System.out.println(solution("3[a]3[b]"));
        System.out.println(solution("3[a2[b2[x]]]"));
    }
}
