package codeSignal.arcade.lvl1;

public class Palindrome {
    static boolean solution(String inputString) {
        int middle = inputString.length() / 2;

        for (int i = 0; i < middle; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    System.out.println(solution("hlbeeykoqqqokyeeblh"));
  }
}
