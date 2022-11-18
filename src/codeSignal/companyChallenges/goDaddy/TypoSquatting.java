package codeSignal.companyChallenges.goDaddy;

import java.util.Arrays;

public class TypoSquatting {
    static int solution(int n, String domain) {

        if (n == 0 || domain.replace(".","").chars().distinct().count() == 1) {
            return -1;
        }

        if (domain.length() - 1 == n) {
            return 1;
        }

        return (int) (Math.log(n) / Math.log(domain.length() - 3));
    }

    public static void main(String[] args) {
        System.out.println(solution(5, "aaaaa.aa"));
    }

}
