package codeSignal.arcade.lvl10;
public class BuildPalindrome {
    String solution(String st) {
        String rs = new StringBuffer(st).reverse().toString();
        String answer = "";

        for (int i = 0; i < st.length(); i++) {

            if (rs.startsWith(st.substring(i))) {
                answer = st.substring(0, i) + rs;
                break;
            }
        }

        return answer;
    }
}
