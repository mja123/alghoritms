package groockingAlgBook;

public class BinarySearch {

    static int solution (int s, int l, int h, int goal) {
        int m = (l + h) / 2;
        s++;

        if (m == goal) {
            return s;
        }

        /*
        Goal = 20
        s (steps) = 0
        l (low)= 0
        h (high)= 100
        m (middle) = (h + l) / 2 = 50
        s++
        m > goal ? h = m : l = m
         */

        if (m > goal) {
            h = m;
        } else {
            l = m;
        }
        return solution(s, l, h, goal);

    }

    public static void main(String[] args) {
        System.out.println(solution(0, 0, 100, 20));
    }
}
