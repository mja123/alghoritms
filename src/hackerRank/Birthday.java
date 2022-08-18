package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birthday {
    //https://www.hackerrank.com/challenges/one-month-preparation-kit-the-birthday-bar/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one&h_r=next-challenge&h_v=zen
    public static int birthday(List<Integer> s, int d, int m) {
        int differentWays = 0;
        List<Integer> group;

        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            if(i+m > s.size()) {
                continue;
            }
            group = s.subList(i, i+m);

            for (Integer number : group) {
                sum+= number;
            }
            if(sum == d) {
                differentWays++;
            }
        }

        return differentWays;
    }

    public static void main(String[] args) {


        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2),3, 2));
        //System.out.println(birthday(Arrays.asList(4),4, 1));
    }
}
