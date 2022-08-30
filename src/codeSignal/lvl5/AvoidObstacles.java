package codeSignal.lvl5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AvoidObstacles {
    /*
        Is not my solution, I could not solve it :(
     */
    int solution(int[] inputArray) {
        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;
            for (int j : inputArray)
                if (j % jump == 0) {
                    fail = true;
                    break;
                }
        }
        return jump;
    }

}
