package codeSignal.lvl3;

public class ReverseInParentheses {
    static String solution(String inputString) {

        if (!inputString.contains("(")) {
            return inputString;
        }

        StringBuilder input = new StringBuilder(inputString);
        StringBuilder result = new StringBuilder();

        //block of inputString that contains parentheses
        int closeParentheses = input.lastIndexOf(")");
        int openParentheses = input.indexOf("(");

        String parentheses = inputString.substring(openParentheses + 1, closeParentheses);

        //appending to result the rest of characters that aren't inside of parentheses
        if ((openParentheses != 0) || (closeParentheses != inputString.length() - 1)) {
            result.append(inputString, 0, openParentheses);
            result.append(inputString, closeParentheses + 1, inputString.length());
        }

        //Solution for when the input contains only one pair of parentheses
        if (!parentheses.contains("(")) {
            result.insert(openParentheses, reverseWord(parentheses));
        }


        return result.toString();
    }

    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();

        for (int i = (word.length() - 1); i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();

    }
    public static void main(String[] args) {
        String word = "foo(bar)baz";
        System.out.println(solution(word));
    }
}
