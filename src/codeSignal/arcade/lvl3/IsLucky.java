package codeSignal.arcade.lvl3;
//https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ/solutions
public class IsLucky {

    boolean solution(int n) {

        String strNumber = String.valueOf(n);
        int counter = 0;

        for (int i = 0; i < strNumber.length(); i++) {

            if (i > ((strNumber.length() / 2) - 1)) {
                counter -= strNumber.charAt(i);
            } else {
                counter += strNumber.charAt(i);
            }
        }
        return counter == 0;
    }
}
