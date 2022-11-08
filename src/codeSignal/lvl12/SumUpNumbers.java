package codeSignal.lvl12;

import java.util.Arrays;

public class SumUpNumbers {
    static int solution(String inputString) {

        return Arrays.stream(inputString.split("\\D"))
                .filter(w -> !w.isEmpty())
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(solution("here are some (12) digits 5566 in this 770 string 239"));
    }

}
