package codeSignal.arcade.lvl5;

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
