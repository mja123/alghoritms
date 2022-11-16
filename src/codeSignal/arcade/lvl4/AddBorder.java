package codeSignal.arcade.lvl4;

public class AddBorder {
    String[] solution(String[] picture) {
        String[] answer = new String[picture.length + 2];

        for (int i = 0; i < answer.length; i++) {
            if ((i == 0) || (i == picture.length + 1)) {
                answer[i] = new String(new char[picture[0].length() + 2]).replace('\0', '*');
            } else {
                answer[i] = new String("*" + picture[i - 1].concat("*"));
            }
        }
        return answer;
    }

}
