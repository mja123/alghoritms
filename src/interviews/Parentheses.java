package interviews;

import java.util.Stack;

/**
 * String input = "[(]{)}()"
 * see if every time there is open bracket, there is a closed one after, and never a closed one before an open one
 * extra: implement for () too
 */
public class Parentheses {
   static boolean parenthesisChecker(String input) {

       Stack<Character> signsAccumulator = new Stack<>();

       for (char sign : input.toCharArray()) {
           if ((sign != '(') && (sign != ')')) {
               continue;
           }
           if (sign == '(') {
               signsAccumulator.push(sign);
           } else {
               if (signsAccumulator.empty()) {
                   return false;
               }
               signsAccumulator.pop();
           }
       }
       return signsAccumulator.empty();
   }

    public static void main(String[] args) {
        System.out.println(parenthesisChecker("[(){()}]"));
    }
}
